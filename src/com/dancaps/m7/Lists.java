package com.dancaps.m7;

import java.util.*;

public class Lists {

    public static void main(String[] args) {
        List myArrayList = new ArrayList<>();

        myArrayList.add(100);
        myArrayList.add(200);
        myArrayList.add(300);
        myArrayList.add(400);
        System.out.println(myArrayList);

        List myLinkedList = new LinkedList<>(myArrayList);
        System.out.println(myLinkedList);
    }
}
