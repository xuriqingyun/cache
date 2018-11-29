package zhouxu.site.cacheclient;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("zhouxu.site.cacheclient.dao")
public class CacheClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CacheClientApplication.class, args);
    }
}
