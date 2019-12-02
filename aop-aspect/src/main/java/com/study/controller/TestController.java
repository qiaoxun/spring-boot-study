package com.study.controller;

import com.study.aop.logging.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Log
    @GetMapping("/addUser")
    public String addUser(String ip, String url) {

        return "test";
    }

}
