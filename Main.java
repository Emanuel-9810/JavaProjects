package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.contains(20);
//        System.out.println(list);
//        LinkedList<Integer> list = new LinkedList<>();
//        list.addLast(10);
//        list.addLast(20);
//        list.addFirst(5);
//        list.removeLast();
//        System.out.println(list);
//        System.out.println(list.contains(10));
//        System.out.println(list.size());

        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        System.out.println(list.contain(20));
        System.out.println(list.indexOf(30));
    }
}
