package cug.lzq.sjmtmessagecenter.controller;

import cug.lzq.sjmtaccountcenter.service.Test;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @DubboReference
    private Test s;

    @RequestMapping("hello")
    public String hello() {
        System.out.println(s.hello());
        return s.hello() + "!";
    }
}
