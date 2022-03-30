package com.company;
import java.util.*;

public class HRstaticInitializerBlock {
        static void areaOfParralelogram(int B, int H){
    int area= B*H;
            System.out.println(area);
}

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int B = sc.nextInt();
            int H = sc.nextInt();
            if (B<=0 || H<=0){
                System.out.println("java.lang.Exception: Breadth and Height must be positive");
            }
            else
            areaOfParralelogram(B,H);
        }
}
