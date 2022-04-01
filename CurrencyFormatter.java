package com.company;
import java.awt.*;
import java.text.NumberFormat;
import java.util.*;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        double amount = Sc.nextDouble();

        Locale indiaLocale = new Locale("en", "IN");

        NumberFormat US = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat India  = NumberFormat.getCurrencyInstance();
        NumberFormat China = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat France = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + US.format(amount));
        System.out.println("India" + India.format(amount));
        System.out.println("China: " + China.format(amount));
        System.out.println("France: " + France.format(amount));

    }
}

