package com.example.java8to11.스트림;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Quiz {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("고예림", 25),
                new Person("강승호", 24),
                new Person("강승호", 24),
                new Person("유순조", 26),
                new Person("윤현식", 27),
                new Person("이재용", 28),
                new Person("정윤미", 23)
        );


        List<Person> tle = people.stream().filter(o -> o.getAge() > 27).collect(Collectors.toList());
        
    }
}
