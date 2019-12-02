package com.study.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LoggingAspect {

    @Pointcut("@annotation(com.study.aop.logging.Log)")
    public void pointcut() {}

    @Around("pointcut()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        Object result = null;
        result = joinPoint.proceed();

        // 1. get args
        Object[] args = joinPoint.getArgs();
        Arrays.stream(args).forEach(System.out::println);
        // 2. get method name
        String methodName = joinPoint.getSignature().getName();
        // 3. get full classname
        String classname = joinPoint.getTarget().toString();
        System.out.println("result = " + result + ", method = " + joinPoint.getSignature().getName());
        return result;
    }

}
