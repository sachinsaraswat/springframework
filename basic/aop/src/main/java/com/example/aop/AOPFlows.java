package com.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPFlows {
    
     

    @Before("execution ( * com.example.aop.*.*.move(..))")
    public void beforeMove(JoinPoint jPoint)
    {
        System.out.println("Before ::" + jPoint.getSignature());

    } 
}
