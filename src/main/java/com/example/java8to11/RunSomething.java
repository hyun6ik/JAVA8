package com.example.java8to11;

@FunctionalInterface
public interface RunSomething {

    int doIt(int number);

    static void printName() {
        System.out.println("Hyunsik");
    }

    default void printAge() {
        System.out.println("27");
    }
}
