package com.qiao.controller;

import com.qiao.domain.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private Person person;

    @RequestMapping("hello")
    public String hello() {
        logger.info("person: " + person);
        System.out.println(person);
        return person.toString();
    }

}
