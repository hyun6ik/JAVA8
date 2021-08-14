package com.example.java8to11.메소드레퍼런스;

import com.example.java8to11.메소드레퍼런스.Greeting;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MethodReference {

    public static void main(String[] args) {


        // 생성자 참조
        Supplier<Greeting> newGreeting = Greeting::new;
        // 위의 식을 썼다고 Gretting 객체가 생기는 것이 아니다.
        Greeting greeting2 = newGreeting.get();
        // 위와 같이 get() 함수를 사용해야 Greeting 객체를 만들 수 있다.

        // 생성자 참조
        Function<String, Greeting> hyunsikGreeting = Greeting::new;
        Greeting hyunsik = hyunsikGreeting.apply("hyunsik");

        // 스태틱 메소드 참조
        UnaryOperator<String> hi = Greeting::hi;
        String hiHyunsik = hi.apply("hyunsik");

        // 특정 객체의 인스턴스 메소드 참조
        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;
        String hi2Hyunsik = hello.apply("hyunsik");


        // 임의 객체(불특성 다수)의 인스턴스 메소드 참조
        String[] names = {"hyunsik", "dongju", "whiteship"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));

        System.out.println("hyunsik = " + hyunsik.getName());
        System.out.println("hiHyunsik = " + hiHyunsik);
        System.out.println("hi2Hyunsik = " + hi2Hyunsik);

    }
}
