package com.personal.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hero {
    private int count;
    private double frequency;
    private double capacity;
    private String name;
    private boolean enabled;
    private Poem poem;
    private double multiplier;
    private double randomNumber;
    private double total;
    private boolean hasCapacity;

    public void perform() {
        System.out.println("count = " + count);
        System.out.println("frequency = " + frequency);
        System.out.println("capacity = " + capacity);
        System.out.println("name = " + name);
        System.out.println("enabled = " + enabled);
        System.out.println("hero begin to recite...");
        poem.perform();
        System.out.println("pi = " + multiplier);
        System.out.println("random number = " + randomNumber);
        System.out.println("total = " + total);
        System.out.println("hasCapacity = " + hasCapacity);
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "spring_01_spel.xml");
        Hero hero = (Hero) context.getBean("hero");
        hero.perform();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Poem getPoem() {
        return poem;
    }

    public void setPoem(Poem poem) {
        this.poem = poem;
    }

    public double getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(double multiplier) {
        this.multiplier = multiplier;
    }

    public double getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(double randomNumber) {
        this.randomNumber = randomNumber;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isHasCapacity() {
        return hasCapacity;
    }

    public void setHasCapacity(boolean hasCapacity) {
        this.hasCapacity = hasCapacity;
    }

}
