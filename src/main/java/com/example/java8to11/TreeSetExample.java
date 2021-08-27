package com.example.java8to11;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample {

    public static class Person{

        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

    }

    public static class PersonComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o2.age- o1.age;
        }
    }



    public static void main(String[] args) {

        TreeSet<Person> set = new TreeSet<>(new PersonComparator());

        set.add(new Person("가나다", 100));
        set.add(new Person("졸리다", 92));
        set.add(new Person("배고프다", 62));
        set.add(new Person("힘들다", 72));

        System.out.println(set);


//        set.add("Hello");
//        set.add("12345");
//        set.add("12345");
//        set.add("hello");
//        set.add("");
//        System.out.println(set);


//        TreeSet<Integer> set = new TreeSet<>();
//
//        Random random = new Random();
//
//        for (int i = 0; i < 20; i++) {
//            set.add(random.nextInt(100));
//        }
//
//        System.out.println(set);
    }
}
