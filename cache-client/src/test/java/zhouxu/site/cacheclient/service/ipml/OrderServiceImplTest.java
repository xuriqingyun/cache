package zhouxu.site.cacheclient.service.ipml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import zhouxu.site.cacheclient.pojo.Orders;
import zhouxu.site.cacheclient.service.OrderService;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zhouxu
 * Date: 2018-11-29 18:23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceImplTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void add() {
        Orders order = new Orders();
        order.setCustomPhone("15243694436");
        order.setProductId(1);
        orderService.add(order);
    }
}