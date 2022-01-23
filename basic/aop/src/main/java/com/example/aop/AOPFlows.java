package com.example.aop;

import javax.management.RuntimeErrorException;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
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


    @After("execution ( * com.example.aop.*.*.move(..))")
    public void afterMove(JoinPoint jPoint)
    {
        System.out.println("After ::" + jPoint.getSignature());

    } 

// @Around suppresses the @Before , @After 

    @Around("execution ( * com.example.aop.*.*.move(..))")
    public void aroundMove(ProceedingJoinPoint jPoint)
    {
        System.out.println("Around  - before ::" + jPoint.getSignature());

        Object [] inputObjects = jPoint.getArgs();

        if( inputObjects ==null)
        {
            System.out.println( "Cannot continue... , Invalid input");
            throw new RuntimeException("Invalid Input - Null");

        }

        for(int i = 0 ; i <inputObjects.length; i++)
        {
            if ( (int)inputObjects[i] <0)
            {
                System.out.println( "Cannot continue... , Invalid input = " + inputObjects[i]);
                throw new RuntimeException("Invalid Input = " + inputObjects[i]);

            }
        }
 



        try {
            jPoint.proceed();

            System.out.println("Around - After :: " + jPoint.getSignature());
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    } 
}
