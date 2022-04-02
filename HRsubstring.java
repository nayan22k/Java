package com.company;
import java.util.*;

public class HRsubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(s.substring(a, b));
    }
}
