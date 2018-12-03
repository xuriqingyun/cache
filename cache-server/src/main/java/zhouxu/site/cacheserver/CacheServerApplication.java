package zhouxu.site.cacheserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("zhouxu.site.cacheserver.dao")
public class CacheServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CacheServerApplication.class, args);
    }
}
