package com.example.aopdemo.aspect;

import com.example.aopdemo.AopDemoApplication;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {
    Logger logger = LoggerFactory.getLogger(AopDemoApplication.class);

    @Before("execution (* com.example.aopdemo.business.*.*(..))")
    public void before(JoinPoint joinPoint){
        logger.info("Intercepted method calls {}", joinPoint);
    }
}
