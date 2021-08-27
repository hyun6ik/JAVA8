package com.example.java8to11.comparator;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorExample {

    public static void main(String[] args) {
        final ArrayList<String> name = new ArrayList<>();

        name.add("aaa");
        name.add("bbb");
        name.add("ccc");
        name.add("ddd");



//        name.sort(String::compareToIgnoreCase);
//        name.forEach(System.out::println);
//
//        System.out.println("====================");
//
        final Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        name.sort(compareToIgnoreCase.reversed().thenComparing(...));
        name.forEach(System.out::println);
    }
}
