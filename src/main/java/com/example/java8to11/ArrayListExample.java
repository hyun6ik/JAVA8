package com.example.java8to11;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Hi", "Bye", "Hello", "Bye");

        ArrayList<String> arrayList = new ArrayList<>(list);

        System.out.println(arrayList.lastIndexOf("Bye"));

        arrayList.add("Last");

        LinkedList<String> linkedList = new LinkedList<>(arrayList);

        System.out.println(linkedList.getLast());



//        List<String> list = new ArrayList<>();

//        list.add("정말 ");
//        list.add("반갑");
//        list.add("습니다.");
//
//        list.add(1, "안 ");
//
//        list = new LinkedList<>(list);
//
//        System.out.println(list.getFirst());
//
//        list.forEach(System.out::print);
//
//        System.out.println();
//
//        list.set(1, "완전히 ");
//        list.forEach(System.out::print);
//
//        System.out.println();
//        System.out.println(list.get(0));



//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next().equals("안")) {
//                iterator.remove();
//            }
//        }


//        List<String> fruitList = new ArrayList<>();
//        List<String> vegetableList = new ArrayList<>();
//
//        fruitList.add("사과");
//        fruitList.add("수박");
//
//        list.addAll(fruitList);
//
//        vegetableList.add("토마토");
//        vegetableList.add("상추");
//
//        list.addAll(0, vegetableList);
//
//        list.forEach(i -> System.out.print(i + " "));

//
//        list.add("정말 ");
//        list.add("반갑");
//        list.add("습니다.");
//
//        list.add(1, "안 ");
//
//        list.forEach(System.out::print);


    }
}
