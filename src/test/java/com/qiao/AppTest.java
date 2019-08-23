package com.qiao;

import static org.junit.Assert.assertTrue;

import com.qiao.domain.Person;
import com.qiao.domain.PersonWithAnnotation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        System.out.println(personWithAnnotation.toString());
    }
}
