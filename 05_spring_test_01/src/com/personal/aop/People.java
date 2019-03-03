package com.personal.aop;

import org.aspectj.lang.annotation.Pointcut;

public class People {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Pointcut
    public void run() {
        System.out.println(this.username + "，在跑路 ...");
    }
}
