package com.concepts.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class List {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("India");
        list.add("USA");
        list.add("America");

        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("Dehli");
        stringLinkedList.add("Washington");
        stringLinkedList.add("NewYork");

        System.out.println(list);
        list.addAll(stringLinkedList);
        System.out.println(list);


        System.out.println(stringLinkedList);
        stringLinkedList.addAll(list);
        System.out.println(stringLinkedList);



    }
}
