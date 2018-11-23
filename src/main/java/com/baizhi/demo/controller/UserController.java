package com.baizhi.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")

public class UserController {

    @RequestMapping("/test")
    public String test(){
        System.out.println("*****************");
        return "-----------------";
    }
}

