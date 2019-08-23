package com.qiao.controller;

import com.qiao.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Person person;

    @RequestMapping("hello")
    public String hello() {
        System.out.println(person);
        return person.toString();
    }

}
