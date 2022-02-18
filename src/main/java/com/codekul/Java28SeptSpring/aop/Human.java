package com.codekul.Java28SeptSpring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy()
public class Human {

    //advice
    @Before("pointCut()")//pointcut
    public void wakeUp(JoinPoint joinPoint){
        System.out.println("Wake up "+joinPoint.getArgs()[0]);
    }

    @After("pointCut()")
    public void sleep(){
        System.out.println("sleep");
    }

    @Pointcut("execution(public * study*(..))")
    public void pointCut(){

    }
}
