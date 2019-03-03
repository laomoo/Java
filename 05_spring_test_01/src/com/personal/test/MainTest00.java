package com.personal.test;

import com.personal.bean.People;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;

public class MainTest00 {

    public static void main(String[] args) {
        People people00 = new People();
        BeanWrapper beanWrapper = new BeanWrapperImpl(people00);
        PropertyValue propertyValue = new PropertyValue("username", "LaoMo");
        beanWrapper.setPropertyValue(propertyValue);
        beanWrapper.setPropertyValue("password", "1234#qwer");
        System.out.println(people00.getUsername());
        System.out.println(people00.getPassword());
    }
}
