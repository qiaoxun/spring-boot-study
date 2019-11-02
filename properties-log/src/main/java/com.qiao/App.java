package com.qiao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ImportResource;

/**
 * Hello world!
 *
 */

//@ImportResource("classpath:beans.xml")
@SpringBootApplication
@EnableCaching
public class App
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class);
    }
}
