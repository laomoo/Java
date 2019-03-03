package com.personal.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Poet {
    private Poem poem;

    public void recite() {
        System.out.println("the poet begin to recite...");
        poem.perform();
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "spring-idol.xml");
        Poet poet = (Poet) context.getBean("poet");
        poet.recite();
    }

    public Poem getPoem() {
        return poem;
    }

    public void setPoem(Poem poem) {
        this.poem = poem;
    }
}
