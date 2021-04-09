package com.example.aopdemo.aspect;

import com.example.aopdemo.AopDemoApplication;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAspect {
    Logger logger = LoggerFactory.getLogger(AopDemoApplication.class);

    @AfterReturning(
            value = "execution (* com.example.aopdemo.business.*.*(..))",
            returning = "result")
    public void after(JoinPoint joinPoint, Object result) {

        logger.info("{} Return with value{}", joinPoint, result);
    }
}
