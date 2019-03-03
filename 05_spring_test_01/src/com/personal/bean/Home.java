package com.personal.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@SuppressWarnings("unused")
public class Home implements InitializingBean, DisposableBean {

    private People people;

    @Override
    public void afterPropertiesSet() {
        People people = new People();
        people.setUsername("父亲");
        people.setPassword("1234#qwer");
        this.people = people;
        //this.people.setUsername("父亲");
        //this.people.setPassword("1234#qwer");
        System.out.println("Bean 继承初始化接口");
    }

    @Override
    public void destroy() {
        System.out.println("Bean 继承销毁接口");
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }
}
