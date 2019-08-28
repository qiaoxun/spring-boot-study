package com.qiao;

import static org.junit.Assert.assertTrue;

import com.qiao.domain.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest 
{
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private Person person;

    @Autowired
    private PersonWithAnnotation personWithAnnotation;

    @Autowired
    private PersonPropertySource personPropertySource;

    @Autowired
    private ApplicationContext context;

    @Autowired
    private PersonBeanAnnotation personBeanAnnotation;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void personTest()
    {
        System.out.println(person.toString());
    }

    @Test
    public void personPropertySourceTest() {
        System.out.println(personPropertySource);
    }

    @Test
    public void testPersonImportSource() {
        System.out.println(context.containsBean("personImportResource"));
    }

    @Test
    public void testPersonBeanAnnotation() {
        System.out.println(personBeanAnnotation);
    }

    @Test
    public void testLog() {
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
    }

}
