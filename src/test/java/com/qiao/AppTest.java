package com.qiao;

import static org.junit.Assert.assertTrue;

import com.qiao.domain.Person;
import com.qiao.domain.PersonImportResource;
import com.qiao.domain.PersonPropertySource;
import com.qiao.domain.PersonWithAnnotation;
import org.junit.Test;
import org.junit.runner.RunWith;
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

    @Autowired
    private Person person;

    @Autowired
    private PersonWithAnnotation personWithAnnotation;

    @Autowired
    private PersonPropertySource personPropertySource;

    @Autowired
    private ApplicationContext context;

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

}
