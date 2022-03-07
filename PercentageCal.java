package com.company;
import java.util.Scanner;

public class PercentageCal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your physics marks : ");
        int physics = scan.nextInt();
        System.out.println("Enter your chemistry marks : ");
        int chemistry = scan.nextInt();
        System.out.println("Enter your maths marks : ");
        int maths = scan.nextInt();
        System.out.println("Enter your english marks : ");
        int english = scan.nextInt();
        System.out.println("Enter your computer marks : ");
        int computer = scan.nextInt();

        float percentage = ((physics+chemistry+maths+english+computer)/500.0f)*100;

        System.out.println("percentage : ");
        System.out.println(percentage);

    }
}
