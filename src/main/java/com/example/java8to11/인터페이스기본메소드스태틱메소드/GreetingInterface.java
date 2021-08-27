package com.example.java8to11.인터페이스기본메소드스태틱메소드;

public interface GreetingInterface {

    void printName();

    /**
     * @ImplSpec 이 구현체는 getName()으로 가져온 문자열을 대문자로 바꿔 출력한다.
     */

    default void printNameUpperCase(){
        System.out.println(getName().toUpperCase());
    }

    String getName();
}
