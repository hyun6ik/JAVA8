package com.example.java8to11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListForLinked {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        long reqTime = System.currentTimeMillis();
        for (int i = 0; i < 50000000; i++) {
           arrayList.add(i);
        }

        long resTime = System.currentTimeMillis();
        System.out.println("ArrayList 걸린시간 : " + (resTime - reqTime)/1000.000);

        List<Integer> linkedList = new LinkedList<>();

        long reqTime2 = System.currentTimeMillis();
        for (int i = 0; i < 50000000; i++) {
            linkedList.add(i);
        }

        long resTime2 = System.currentTimeMillis();
        System.out.println("LinkedList 걸린시간 : " + (resTime - reqTime)/1000.000);
    }
}
