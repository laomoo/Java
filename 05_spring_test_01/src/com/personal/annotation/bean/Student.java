package com.personal.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("HelloWorld")
@Order(2)
@Scope(scopeName="prototype")
public class Student {

    @Value(value="张三")
    private String username;
    @Value(value = "18")
    private String age;

    @Autowired
    private Leg leg;

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public String getAge() {
        return age;
    }
}
