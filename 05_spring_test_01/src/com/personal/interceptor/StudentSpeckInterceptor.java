package com.personal.interceptor;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class StudentSpeckInterceptor implements MethodBeforeAdvice, AfterReturningAdvice, MethodInterceptor, ThrowsAdvice, AfterAdvice {

    // 前置通知（Before Advice）
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("学生说之前 ...");
    }

    // 后置通知（After Advice）
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("学生说之后 ...");
    }

    // 环绕通知（Around Advices）
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        System.out.println("环绕通知之前 ...");
        methodInvocation.proceed();
        System.out.println("环绕通知之后 ...");
        return null;
    }

    // 后置异常通知（After throwing Advice）
    public void afterThrowing(ClassNotFoundException ex) throws Throwable {
        System.out.println("系统抛出ClassNotFoundException异常，异常提示为： " + ex.getMessage());
    }
}
