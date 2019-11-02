package com.qiao.config;

import com.qiao.domain.PersonBeanAnnotation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public PersonBeanAnnotation personBeanAnnotation() {
        PersonBeanAnnotation personBeanAnnotation = new PersonBeanAnnotation();
        personBeanAnnotation.setAge(30);
        personBeanAnnotation.setEmail("test@gmail.com");
        personBeanAnnotation.setFirstName("Joey");
        personBeanAnnotation.setLastName("Qiao");
        return personBeanAnnotation;
    }
}
