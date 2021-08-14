package com.example.java8to11.스트림;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("hyunsik");
        names.add("hyunsik2");
        names.add("hyunsik3");
        names.add("aaa");
        names.add("bbb");
        names.add("ccc");

//        Stream<String> stringStream = names.stream().map(String::toUpperCase);
//
//        Stream<String> mapStream = names.stream()
//                .map(s -> {
//                    System.out.println(s);
//                    return s.toUpperCase();
//                });

//        System.out.println("=====================");
//
//        List<String> toUpperNameList = names.stream()
//                .map(s -> {
//                    System.out.println("중개 오퍼레이션 실행!!");
//                    return s.toUpperCase();
//                })
//                .collect(Collectors.toList());
//        toUpperNameList.forEach(System.out::println);
//
//        System.out.println("=====================");
//        System.out.println("names List는 그대로 입니다!!");
//        names.forEach(System.out::println);
//        System.out.println("=====================");

//        for (String name : names) {
//            if (name.startsWith("h")) {
//                System.out.println(name.toUpperCase(Locale.getDefault()));
//            }
//        }

        List<String> collect = names.parallelStream().filter(n -> n.startsWith("h")).map(s -> {
            System.out.println(s + " " + Thread.currentThread().getName());
            return s.toUpperCase();
        }).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
