package zhouxu.site.cacheclient.service.ipml;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import zhouxu.site.cacheclient.constants.RestConst;
import zhouxu.site.cacheclient.dao.RedisDao;
import zhouxu.site.cacheclient.exception.BizException;
import zhouxu.site.cacheclient.pojo.Mail;
import zhouxu.site.cacheclient.pojo.Orders;
import zhouxu.site.cacheclient.pojo.Store;
import zhouxu.site.cacheclient.service.MailService;
import zhouxu.site.cacheclient.service.OrderService;
import zhouxu.site.cacheclient.service.StoreService;
import zhouxu.site.cacheclient.utils.JsonUtils;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zhouxu
 * Date: 2018-11-29 18:04
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private MailService mailService;

    @Autowired
    private StoreService storeService;

    @Autowired
    private RedisDao redisDao;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${cache-exhange}")
    private String exhange;
    @Value("${cache-routingKey}")
    private String routingKey;

    /**
     * @Author zhouxu
     * @Description //发送订单消息
     * @Date 2018/11/30 18:04
     * @Param [order]
     * @return boolean
     * @throws
     **/
    public boolean sendOrderMsg(Orders order)
    {
        try{
            rabbitTemplate.convertAndSend(exhange,routingKey,JsonUtils.toJson(order));
        }catch (Exception e){
            throw  new BizException(RestConst.CommonEnum.ORDERFAIL);
        }
        return true;
    }

    @Override
    public boolean add(Orders order) {
        //检测数量
        Store store = storeService.getById(order.getProductId());

        String orderKey="order:"+store.getProductId()+":"+order.getCustomPhone();

        if(!redisDao.hasKey(orderKey)){
            //传送消息
            if(store.getPrudctCount()>0){
                //发送下单消息
                sendOrderMsg(order);
                //发送消息提醒
                Mail mail = new Mail();
                mail.setFrom("devoperation@163.com");
                mail.setTo("1136112121@qq.com");
                mail.setContent(order.getCustomPhone()+"下单成功");
                mail.setTitle("订单提醒");
                mail.setType("simpletext");
                mailService.sendEmail(mail);
                //减库存
                store.setPrudctCount(store.getPrudctCount()-1);
                String storeKey="product:"+store.getProductId();
                redisDao.set(storeKey,JsonUtils.toJson(store));

                //写入order缓存
                redisDao.hset(orderKey,order.getCustomPhone(),JsonUtils.toJson(order));
//                System.out.println("下单成功");
                return true;
            }else{
                throw new BizException(RestConst.CommonEnum.INSUFFICIENTSTOCK);
            }
        }else{
            throw new BizException(RestConst.CommonEnum.ORDERHAVEBEENPLACED);
        }
    }
}
