package com.personal.test;

import com.personal.aop.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest02 {

    public static void main(String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring_00.xml");
        Student student_00 = context.getBean("bean_18", Student.class);
        student_00.sayHello();
        student_00.sayGoodBye();


        //        // 创建代理工厂
        //        ProxyFactory proxyFactory = new ProxyFactory();
        //        // 创建代理工厂
        //        proxyFactory.setTarget(new Student());
        //        // 设置需要设置的通知
        //        proxyFactory.addAdvice(new StudentSpeckInterceptor());
        //        // 设置需要设置的通知
        //        Student student_01 = (Student) proxyFactory.getProxy();
        //        student_01.setUsername("张三");
        //        student_01.sayHello();
        //        System.out.println("====");
        //        student_01.throwNewException();


    }
}
