package com.study.interceptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("interceptor")
public class InterceptorController {

    @GetMapping("hello-world")
    public String helloWorld() {
        return "Hello World";
    }

}
