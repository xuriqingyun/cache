package zhouxu.site.cacheserver.service.ipml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import zhouxu.site.cacheserver.pojo.Orders;
import zhouxu.site.cacheserver.service.OrderService;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zhouxu
 * Date: 2018-12-03 11:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceImplTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void add() {
        Orders order = new Orders();
        order.setProductId(1);
        order.setOrderId(1);
        order.setCustomPhone("15676252");
        orderService.add(order);
    }
}