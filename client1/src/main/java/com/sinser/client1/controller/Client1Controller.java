package com.sinser.client1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description :
 *
 * @author : zhang
 * @date : 2018/11/2 9:46
 */
@RestController
public class Client1Controller {

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        return "hello " + name +",Im client1;";
    }
}
