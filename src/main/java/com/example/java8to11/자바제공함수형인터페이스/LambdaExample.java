package com.example.java8to11.자바제공함수형인터페이스;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class LambdaExample {

    public static void main(String[] args) {
        LambdaExample lambda = new LambdaExample();
        lambda.run();
    }

    private void run() {
        //local Variable
        int baseNumber = 100;

        //로컬 클래스
        class LocalClass {
            void printBaseNumber() {
                int baseNumber = 11;
                System.out.println(baseNumber);
            }
        }

        // 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                int baseNumber = 11;
                System.out.println(baseNumber);
            }
        };

        // 람다
        IntConsumer printInt = (i) -> System.out.println(i + baseNumber);

        printInt.accept(100);
    }


}
