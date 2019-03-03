package com.personal.aop;

@SuppressWarnings("unused")
public class Student {

    public Student() {

    }

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void sayHello() {
        System.out.println("大家好，我的名字叫：" + this.username + "。");
    }

    public void sayGoodBye() {
        System.out.println("再见，我的名字叫：" + this.username + "。");
    }

    public void throwNewException() throws ClassNotFoundException {
        throw new ClassNotFoundException("未知类未找到");
    }
}
