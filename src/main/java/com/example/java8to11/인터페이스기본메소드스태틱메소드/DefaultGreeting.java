package com.example.java8to11.인터페이스기본메소드스태틱메소드;

public class DefaultGreeting implements GreetingInterface{

    private String name;

    public DefaultGreeting(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(this.name);
    }

    @Override
    public String getName() {
        return name;
    }

}
