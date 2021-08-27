package com.example.java8to11.iterable;

import java.util.ArrayList;
import java.util.Spliterator;

public class IterableExample {

    public static void main(String[] args) {
        final ArrayList<String> name = new ArrayList<>();

        name.add("aaa");
        name.add("bbb");
        name.add("ccc");
        name.add("ddd");

        name.forEach(System.out::println);

        final Spliterator<String> spliterator = name.spliterator();
        final Spliterator<String> spliterator1 = spliterator.trySplit();
        while(spliterator.tryAdvance(System.out::println));
        System.out.println("====================");
        while(spliterator1.tryAdvance(System.out::println));
    }
}
