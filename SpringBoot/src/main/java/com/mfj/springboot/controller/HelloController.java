package com.mfj.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

    @RequestMapping("hello")
    public String hello() {

        return "my first springboot program,happy motherfucker";
    }
}
