package com.springboot.buy.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author QiaoGuanHui
 * @date 2019/10/15-9:24
 */
@RestController
public class TestController {
    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
