package com.example.java8to11.자바제공함수형인터페이스;

import java.util.function.Function;

public class Plus10 implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer integer) {
        return integer + 10;
    }
}
