package com.Chen.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import javax.sound.midi.Soundbank;

//使用注解方式实现AOP
@Aspect  //标注这个面是一个切面
public class AnnotationPointCut {
    @Before("execution(* com.Chen.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("方法执行前");
    }
    @After("execution(* com.Chen.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("方法执行后");
    }
    //在环绕增强中，我们可以给定一个参数，代表我们要处理切入的点
    @Around("execution(* com.Chen.service.UserServiceImpl.*(..))")
    public void arround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        Signature signature = joinPoint.getSignature();//获得签名
        System.out.println("signature = " + signature);
        //执行方法
        Object proceed = joinPoint.proceed();
        System.out.println("环绕后");
        System.out.println("proceed = " + proceed);
    }
}
