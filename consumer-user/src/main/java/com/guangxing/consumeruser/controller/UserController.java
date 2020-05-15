package com.guangxing.consumeruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program springboot-cloud
 * 服务消费者
 * @description: 消费生产者生产的票据信息
 * @author: Guangxing
 * @create: 2020/05/15 09:19
 */
@RestController
public class UserController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/buy")
    public String buyTicket(){
        return restTemplate.getForObject("http://PROVIDER-TICKER/ticket", String.class);
    }
}
