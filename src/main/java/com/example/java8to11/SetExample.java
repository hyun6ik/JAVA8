package com.example.java8to11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("안녕하세요.");
        set.add("누구세요?");
        set.add("죄송합니다.");
        set.add("안녕하세요.");
        set.add("안녕하세요.");

        System.out.println("Set의 인스턴수 개수 = " + set.size());

        for (String s : set) {
            System.out.print(s + " ");
        }
    }
}
