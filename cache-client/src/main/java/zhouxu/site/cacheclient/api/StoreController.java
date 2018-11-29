package zhouxu.site.cacheclient.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import zhouxu.site.cacheclient.service.StoreService;
import zhouxu.site.cacheclient.utils.RestResult;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zhouxu
 * Date: 2018-11-29 14:08
 */
@RestController
public class StoreController {

    @Autowired
    private StoreService storeService;

    @GetMapping("/get/{id}")
    public RestResult get(@PathVariable("id") Integer id){
        return RestResult.Success(storeService.getById(id));
    }
}
