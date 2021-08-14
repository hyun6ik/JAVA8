package com.example.java8to11.메소드레퍼런스;

import com.example.java8to11.메소드레퍼런스.Greeting;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MethodReference {

    public static void main(String[] args) {
        Greeting greeting = new Greeting();

        Supplier<Greeting> newGreeting = Greeting::new;
        Greeting greeting2 = newGreeting.get();

        Function<String, Greeting> hyunsikGreeting = Greeting::new;
        Greeting hyunsik = hyunsikGreeting.apply("hyunsik");

        String[] names = {"hyunsik", "dongju", "whiteship"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));

        UnaryOperator<String> hi = Greeting::hi;
        String hiHyunsik = hi.apply("hyunsik");
        UnaryOperator<String> hello = greeting::hello;
        String hi2Hyunsik = hello.apply("hyunsik");

        System.out.println("hyunsik = " + hyunsik.getName());
        System.out.println("hiHyunsik = " + hiHyunsik);
        System.out.println("hi2Hyunsik = " + hi2Hyunsik);

    }
}
