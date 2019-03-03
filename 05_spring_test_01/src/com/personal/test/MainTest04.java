package com.personal.test;

import com.personal.annotation.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest04 {

    public static void main(String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring_02_annotation.xml");

        Student student_00 = context.getBean("HelloWorld", Student.class);
        System.out.println(student_00.getUsername());
        System.out.println(student_00.getAge());
        System.out.println(student_00.getLeg());
    }
}
