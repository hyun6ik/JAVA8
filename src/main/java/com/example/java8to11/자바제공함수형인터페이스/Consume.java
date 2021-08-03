package com.example.java8to11.자바제공함수형인터페이스;

import java.util.function.Consumer;

public class Consume {

    public static void main(String[] args) {
        Consumer<String> printT = (s) -> System.out.println(s);
        printT.accept("Hello");
    }
}
