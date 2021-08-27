package com.example.java8to11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListForArray {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        long reqTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            if (i == 0) {
                arrayList.add(i);
            } else {
                arrayList.add(i - 1, i);
            }
        }

        long resTime = System.currentTimeMillis();
        System.out.println("ArrayList 걸린시간 : " + (resTime - reqTime)/1000.000);

        List<Integer> linkedList = new LinkedList<>();

        long reqTime2 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            if (i == 0) {
                linkedList.add(i);
            } else {
                linkedList.add(i - 1, i);
            }
        }

        long resTime2 = System.currentTimeMillis();
        System.out.println("LinkedList 걸린시간 : " + (resTime2 - reqTime2)/1000.000);



    }
}
