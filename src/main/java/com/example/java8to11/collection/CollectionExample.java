package com.example.java8to11.collection;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionExample {

    public static void main(String[] args) {
        final ArrayList<String> name = new ArrayList<>();

        name.add("aaa");
        name.add("bbb");
        name.add("ccc");
        name.add("ddd");

        final Set<String> set = name.stream().map(String::toUpperCase)
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toSet());

        set.forEach(System.out::println);

//        name.removeIf(s -> s.startsWith("d"));
//        name.forEach(System.out::println);
    }
}
