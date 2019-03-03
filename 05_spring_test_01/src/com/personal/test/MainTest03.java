package com.personal.test;

import com.personal.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest03 {

    public static void main(String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring_01_spel.xml");
        //        Student student_00 = context.getBean("bean_00", Student.class);
        //        System.out.println(student_00.getUsername());

        Student student_01 = context.getBean("bean_01", Student.class);
        System.out.println(student_01.getUsername());
        System.out.println(student_01.getPassword());


    }
}
