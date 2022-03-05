package com.company;


import java.util.Scanner;

public class Two_dishes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){


            System.out.println("Enter the rating");
            int x = sc.nextInt();
            if (x<100 && x>=1) {
                System.out.println("Easy");
            }
            else if(x>=100 && x<200) {
                System.out.println("Medium");
            }
            else if (x>=200 && x<=300) {
                System.out.println("Hard");
            }
        }





    }

}
