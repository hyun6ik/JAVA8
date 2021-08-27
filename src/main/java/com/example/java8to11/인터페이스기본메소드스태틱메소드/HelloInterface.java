package com.example.java8to11.인터페이스기본메소드스태틱메소드;

public interface HelloInterface {

    default void printNameUpperCase() {
        System.out.println("HELLO");
    }
}
