package com.personal.test;

import com.personal.bean.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest01 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_00.xml");
        //        People people_00 = (People) context.getBean("bean_03");
        //        System.out.println(people_00.getUsername());
        //        System.out.println(people_00.getPassword());
        //
        //        People people_01 = (People) context.getBean("bean_05");
        //        System.out.println(people_01.getUsername());
        //        System.out.println(people_01.getPassword());

        //        Student student_00 = (Student) context.getBean("bean_01");
        //        System.out.println(student_00.getUsername());
        //        System.out.println(student_00.getPassword());
        //        People people_01 = (People) context.getBean("bean_00");
        //        System.out.println("scope:singleton 单例模式下实例类people_00的地址：" + people_00);
        //        System.out.println("scope:singleton 单例模式下实例类people_01的地址：" + people_01);

        //        Student student_01 = (Student) context.getBean("bean_01");
        //        Student student_02 = (Student) context.getBean("bean_01");
        //        System.out.println(student_01);
        //        System.out.println(student_02);

        //        Student student_03 = context.getBean(Student.class);
        //        System.out.println(student_03);
        //
        //        Student student_04 = context.getBean(Student.class);
        //        System.out.println(student_04);

        School school_00 = (School) context.getBean("bean_06");
        System.out.println(school_00.getStudent().getUsername());
        System.out.println(school_00.getSchoolName());

        ((ClassPathXmlApplicationContext) context).destroy();

        //        Home home_00 = (Home) context.getBean("bean_07");
        //        System.out.println(home_00.getPeople().getUsername());

        //        People people_04 = (People) context.getBean("bean_00");
        //        System.out.println("字符打印：" + people_04.getPassword());
        //        System.out.println("字符长度：" + people_04.getPassword().length());

        //        People people_05 = (People) context.getBean("bean_08");
        //        System.out.println("字符打印：" + people_05.getPassword());
        //        System.out.println("字符长度：" + people_05.getPassword().length());

        //        People people_06 = context.getBean("bean_10", People.class);
        //        System.out.println(people_06.getUsername());
        //
        //        Student people_07 = context.getBean("bean_11", Student.class);
        //        System.out.println(people_07.getUsername());
        //
        //        Family family_00 = context.getBean("bean_12", Family.class);
        //        System.out.println(family_00.getHome().getPeople().getUsername());

        //        Class class_00 = context.getBean("bean_15", Class.class);
        //
        //        for (Student student : class_00.getStudents()) {
        //            System.out.println(student.getUsername());
        //        }

        //        Teacher teacher_00 = context.getBean("bean_16", Teacher.class);
        //        Map<String, String> post = teacher_00.getPost();
        //        Set<Map.Entry<String, String>> entries = post.entrySet();
        //        for (Map.Entry<String, String> entrie : entries) {
        //            System.out.println(entrie.getKey() + "  " + post.get(entrie.getKey()));
        //        }

        //        Woman woman_00 = context.getBean("bean_17", Woman.class);
        //        Set<Map.Entry<Object, Object>> entries = woman_00.getProperties().entrySet();
        //        for (Map.Entry<Object, Object> entry : entries) {
        //            System.out.println(entry.getKey() + " " + entry.getValue());
        //        }
    }
}
