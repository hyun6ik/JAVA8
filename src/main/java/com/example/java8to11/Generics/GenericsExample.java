package com.example.java8to11.Generics;

import java.util.ArrayList;

public class GenericsExample {

    public static class TV {
        private int channel;
        private String name;
    }

    public static class Audio{
        private int channel;
        private String name;
    }

    public static void main(String[] args) {

        ArrayList tvList = new ArrayList();
        tvList.add(new TV());
        tvList.add(new Audio());
        TV t = (TV) tvList.get(0);

        ArrayList<TV> tvList = new ArrayList<>();

        tvList.add(new TV());    // OK
        tvList.add(new Audio()); // 컴파일 에러, TV 외에 다른 타입은 저장 불가
        TV tv = tvList.get(0);  // 형변환 불필요
    }
}
