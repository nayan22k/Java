package com.company;

import java.util.Scanner;

public class PracticeSet14 {
    public static void main(String[] args) {
        // Problem 1
        // Syntax error int a = 7
        int age = 78;
        int year_born = 2000 - 78;  // Logical error
        System.out.println(6 / 8);

        // Problem 2
        try {
            int a = 666 / 9;
        } catch (IllegalArgumentException e) {
            System.out.println("HaHa");
        } catch (ArithmeticException e) {
            System.out.println("HeHe");
        }

        // Problem 3
        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while (flag && i<5){
            try {
                index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid Index");
                i++;
            }
        }
        if (i>5){
            System.out.println("Error");
        }
    }
}

