package com.example.java8to11;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ListTest {

    @Test
    public void listTest() throws Exception {
        //given
        List<String> list = Arrays.asList("Hi", "Bye", "Hello", "Bye");
        //when
        ArrayList<String> arrayList = new ArrayList<>(list);
        arrayList.add("Last");
        LinkedList<String> linkedList = new LinkedList<>(arrayList);
        //then
        assertThat(arrayList.lastIndexOf("Bye")).isEqualTo(3);
        assertThat(linkedList.getLast()).isEqualTo("Last");
        assertThat(arrayList).isEqualTo(linkedList);
        assertThat(arrayList).isNotSameAs(linkedList);

    }


}
