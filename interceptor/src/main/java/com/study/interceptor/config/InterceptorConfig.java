package com.study.interceptor.config;

import com.study.interceptor.interceptor.LoggerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        LoggerInterceptor loggerInterceptor = new LoggerInterceptor();
        registry.addInterceptor(loggerInterceptor);
    }
}
