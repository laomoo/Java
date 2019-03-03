package com.personal.annotation.bean;

import org.springframework.stereotype.Repository;

@Repository("leg")
public class Leg {

    private String length;

    public void setLength(String length) {
        this.length = length;
    }

    public String getLength() {
        return length;
    }
}
