package com.personal.test;

import com.personal.aop.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest05 {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_04_aop.xml");
        People people_00 = context.getBean("bean_000", People.class);
        people_00.run();
    }
}
