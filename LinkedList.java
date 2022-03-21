package com.company;

public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<Integer> l1 = new java.util.LinkedList<>();
        java.util.LinkedList<Integer> l2 = new java.util.LinkedList<>();
        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,5);
        l1.add(0,1);
        l1.addAll(0,l2);
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(7));
        System.out.println(l1.lastIndexOf(6));
        l1.set(1,566);
        for (int i = 0; i<l1.size(); i++) {
            System.out.println(l1.get(i));
            System.out.println(", ");
        }
    }
}
