package com.company;

public class presedency_associativity {
    public static void main(String[] args) {
        // Presedence & Associativity
    //    int a = 6*5-34/2;
        /*
        Highest presedence goes to * and /. They are then vealuated on the basis of left to right associativity
        =30-34/2
        =30-17
        =13
         */
   //     System.out.println(a);
    //    System.out.println(b);
        // quick quiz
    //    int x = 6;
    //    int y = 1;
    //    int k = x*y/2;
        int b=1;
        int c=4;
        int a=5;
        int k = b*b - (4*a*c)/(2*a);
        System.out.println(k);

    }
}
