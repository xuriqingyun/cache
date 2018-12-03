package zhouxu.site.cacheserver.listener;


import com.rabbitmq.client.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import zhouxu.site.cacheserver.pojo.Orders;
import zhouxu.site.cacheserver.service.OrderService;
import zhouxu.site.cacheserver.utils.JsonUtils;

/**
 * Created with IntelliJ IDEA.
 * Description:消息消费监听
 * User: zhouxu
 * Date: 2018-11-26 12:10
 */
@Component
@RabbitListener(queues = "order-queue")
public class OrderListener {

    @Autowired
    private OrderService orderService;

    private static Logger logger = LoggerFactory.getLogger(OrderListener.class);

    @RabbitHandler
    public void onMessage(String orderJson, Channel channel, Message message){
        try {
            logger.info("recive message:"+orderJson);
            logger.info("========================handeling message ===============================");
            Orders order = JsonUtils.parse(orderJson, Orders.class);
            orderService.add(order);
            //告诉服务器收到这条消息 已经被我消费了 可以在队列删掉 这样以后就不会再发了 否则消息服务器以为这条消息没处理掉 后续还会在发
            channel.basicAck(message.getMessageProperties().getDeliveryTag(),false);
            logger.info("========================handeled message ===============================");
        } catch (Exception e) {
            e.printStackTrace();
            //丢弃这条消息
            logger.info("receiver fail");
        }

    }
}
