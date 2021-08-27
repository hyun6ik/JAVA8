package com.example.java8to11;

import java.util.HashSet;

public class Number {

    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

class Question{

    public static void main(String[] args) {
        HashSet<Number> set = new HashSet<>();
        set.add(new Number(1234));
        set.add(new Number(5678));
        set.add(new Number(1234));

        System.out.println("set의 인스턴스 개수는 = " + set.size());

        for (Number number : set) {
            System.out.print(number.getNumber() + " ");
        }
    }
}
