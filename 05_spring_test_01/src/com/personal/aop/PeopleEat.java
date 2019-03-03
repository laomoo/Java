package com.personal.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PeopleEat {

    @After(value = "execution(* com.personal.aop.People.run(..))")
    public void eat () {
        System.out.println("吃东西 ...");
    }
}
