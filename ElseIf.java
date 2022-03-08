package com.company;

public class ElseIf {
    public static void main(String[] args) {
        String var = "Shubham";

        switch(var){
            case "Shubham"-> {
                System.out.println("You are going to become an adult!");
                System.out.println("You are going to become an adult!");
                System.out.println("You are going to become an adult!");
            }
            case "Saurabh" -> System.out.println("You are going to join a job");

            case "Vishaka" -> System.out.println("You are going to get retired");

            default -> System.out.println("Enjoy your life");
        }
        System.out.println("Thanks for using my java code!");





       /*
       int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>56) {
            System.out.println("You are experienced!");
        }
        else if(age>46) {
            System.out.println("You are semi experienced!");
        }
        else if (age>36) {
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("You are not experienced");
        }
        */
    }
}
