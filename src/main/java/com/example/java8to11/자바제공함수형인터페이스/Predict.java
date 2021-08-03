package com.example.java8to11.자바제공함수형인터페이스;

import java.util.function.Predicate;

public class Predict {

    public static void main(String[] args) {
        Predicate<String> startsWithHyunSik = (s) -> s.startsWith("hyunsik");
        Predicate<Integer> isOdd = (i) -> i % 2 == 1;

        System.out.println("startsWithHyunSik.test(\"hyunsikYoon\") = " + startsWithHyunSik.test("hyunsikYoon"));

        System.out.println("isOdd.test(4) = " + isOdd.test(4));

    }
}
