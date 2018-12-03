package zhouxu.site.cacheserver.service.ipml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import zhouxu.site.cacheserver.pojo.Store;
import zhouxu.site.cacheserver.service.StoreService;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zhouxu
 * Date: 2018-12-03 11:25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StoreServiceImplTest {

    @Autowired
    private StoreService storeService;

    @Test
    public void getById() {
        Store byId=null;
        byId = storeService.getById(1);
        System.out.println(byId);
    }
}