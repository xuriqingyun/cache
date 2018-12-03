package zhouxu.site.cacheclient.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhouxu.site.cacheclient.pojo.Orders;
import zhouxu.site.cacheclient.service.OrderService;
import zhouxu.site.cacheclient.utils.RestResult;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zhouxu
 * Date: 2018-12-03 10:15
 */
@RestController
@RequestMapping("/api/v1")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * @Author zhouxu
     * @Description //下订单
     * @Date 2018/12/3 10:19
     * @Param [order]
     * @return zhouxu.site.cacheclient.utils.RestResult
     * @throws
     **/
    @PostMapping("/order/add")
    public RestResult add(@RequestBody Orders order){
        return RestResult.Success(orderService.add(order));
    }
}
