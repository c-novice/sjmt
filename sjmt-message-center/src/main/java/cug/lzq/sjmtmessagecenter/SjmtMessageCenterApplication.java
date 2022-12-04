package cug.lzq.sjmtmessagecenter;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class SjmtMessageCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SjmtMessageCenterApplication.class, args);
    }

}
