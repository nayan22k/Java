package com.company;
import java.util.*;

public class HRstringToken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] t = s.split("[^a-zA-Z]");
        int numt = 0;

        for (int i=0; i<t.length; ++i)
            if (t[i].length() > 0)
                numt++;

        System.out.println(numt);

        for (int i=0; i <t.length; ++i)
            if (t[i].length()>0)
                System.out.println(t[i]);


    }
}
