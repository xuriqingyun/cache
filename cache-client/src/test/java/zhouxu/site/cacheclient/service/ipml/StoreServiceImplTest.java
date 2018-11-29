package zhouxu.site.cacheclient.service.ipml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import zhouxu.site.cacheclient.pojo.Store;
import zhouxu.site.cacheclient.service.StoreService;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zhouxu
 * Date: 2018-11-29 13:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StoreServiceImplTest {

    @Autowired
    private StoreService storeService;

    @Test
    public void getById() {
        int id=1;
        Store store = storeService.getById(1);
        System.out.println(store);
    }
}