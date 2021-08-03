package com.example.java8to11.자바제공함수형인터페이스;

import java.util.function.Supplier;

public class Supply {

    public static void main(String[] args) {
        Supplier<Integer> get10 = () -> 10;
        get10.get();
    }
}
