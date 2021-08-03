package com.example.java8to11.자바제공함수형인터페이스;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Plus {


    public static void main(String[] args) {
//        Function<Integer, Integer> plus10 = (i) -> i + 10;
        UnaryOperator<Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multiply2 = (i) -> i* 2;

        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
        System.out.println("multiply2AndPlus10.apply(2) = " + multiply2AndPlus10.apply(2));

        Function<Integer, Integer> plus10AndMultiply2 = plus10.andThen(multiply2);
        System.out.println("plus10AndMultiply2.apply(2) = " + plus10AndMultiply2.apply(2));

    }
}
