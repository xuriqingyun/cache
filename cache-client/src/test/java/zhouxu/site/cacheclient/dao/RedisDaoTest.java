package zhouxu.site.cacheclient.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zhouxu
 * Date: 2018-11-29 16:34
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisDaoTest {

    @Autowired
    private RedisDao redisDao;

    @Test
    public void name() {
        boolean set = redisDao.set("test", "test");
        System.out.println(set);

        Object test = redisDao.get("test");
        System.out.println(test);
    }

    @Test
    public void hget() {
        redisDao.hset("cpu","001","100");
        redisDao.hset("cpu","002","200");
    }

    @Test
    public void hmget() {
    }
}