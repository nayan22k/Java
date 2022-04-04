package com.company;

import java.util.*;
import java.util.regex.*;
import java.util.regex.PatternSyntaxException;

public class HRPatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = Integer.parseInt(sc.nextLine());
        while (i>0){
            String pattern = sc.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch (PatternSyntaxException e){
                System.out.println("Invalid");
            }
            i--;
        }
    }
}
