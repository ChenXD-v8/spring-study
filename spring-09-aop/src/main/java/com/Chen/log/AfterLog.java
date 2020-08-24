package com.Chen.log;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {
    /**
     *
     * @param returnValue  返回值
     * @param method  调用目标对象的方法
     * @param args
     * @param target   目标对象
     * @throws Throwable
     */
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了"+method.getName()+"方法。返回结果为"+returnValue);
    }
}
