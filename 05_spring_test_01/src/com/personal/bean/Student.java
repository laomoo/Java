package com.personal.bean;

@SuppressWarnings("unused")
public class Student {

    private String username;
    public String password;

    public Student(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    @SuppressWarnings("unused")
    public void setPassword(String password) {
        this.password = password;
    }

    @SuppressWarnings("unused")
    public void setUsername(String username) {
        this.username = username;
    }
}
