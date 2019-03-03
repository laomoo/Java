package com.personal.aop;

public class Wife {

    public Wife() {

    }

    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void getTrueUsername() throws Exception {

        Thread.sleep(50);
        System.out.println(this.username);
        Thread.sleep(50);
    }

}
