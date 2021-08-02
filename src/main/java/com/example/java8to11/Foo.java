package com.example.java8to11;

public class Foo {


    public static void main(String[] args) {
        // 익명 내부 클래스 anonymous inner class
        RunSomething runSomething = new RunSomething() {
            int baseNumber = 10;
            @Override
            public int doIt(int number) {
                baseNumber ++;
                return number + baseNumber;
            }
        };
    }
}
