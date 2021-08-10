package com.example.java8to11.자바제공함수형인터페이스;

import java.util.ArrayList;
import java.util.stream.Stream;


public class Example {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(3);
        Stream<Integer> stream = list.stream();
        System.out.println(stream.sorted().findFirst());

    }
}
