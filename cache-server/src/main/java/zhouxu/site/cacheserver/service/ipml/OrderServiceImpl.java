package zhouxu.site.cacheserver.service.ipml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zhouxu.site.cacheserver.constants.RestConst;
import zhouxu.site.cacheserver.dao.OrdersMapper;
import zhouxu.site.cacheserver.exception.BizException;
import zhouxu.site.cacheserver.pojo.Orders;
import zhouxu.site.cacheserver.pojo.Store;
import zhouxu.site.cacheserver.service.OrderService;
import zhouxu.site.cacheserver.service.StoreService;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zhouxu
 * Date: 2018-11-29 18:04
 */
@Service
public class OrderServiceImpl implements OrderService {

    private static final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);


    @Autowired
    private OrdersMapper ordersMapper;

    @Autowired
    private StoreService storeService;


    @Override
    @Transactional
    public boolean add(Orders order) {
        if (order.getProductId() == null) {
         throw new BizException(RestConst.CommonEnum.NOTNULL);
        }
        Store store = storeService.getById(order.getProductId());

        store.setPrudctCount(store.getPrudctCount()-1);
        storeService.update(store);
        //add
        ordersMapper.insertSelective(order);
        return true;
    }
}
