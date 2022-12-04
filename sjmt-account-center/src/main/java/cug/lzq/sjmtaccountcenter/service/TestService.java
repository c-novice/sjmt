package cug.lzq.sjmtaccountcenter.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

@Service
@DubboService
public class TestService implements Test {
    @Override
    public String hello() {
        System.out.println("hello world");
        return "你好，世界";
    }
}
