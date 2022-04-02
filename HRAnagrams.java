package com.company;
import java.util.*;

public class HRAnagrams {
    static boolean isAnagram(String A, String B){
        if (A == null || B == null){
            if (A != null || B != null){
                return false;
            }
            return true;
        }

        A = A.toLowerCase();
        B = B.toLowerCase();
        char arrA[] = A.toCharArray();
        char arrB[] = B.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        String As= new String(arrA);
        String Bs = new String(arrB);

        return As.equals(Bs);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        boolean x = isAnagram(A,B);
        if (x)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}
