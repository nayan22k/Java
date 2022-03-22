package com.company;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

public class cwh_84_throw_and_throws {
    public static float area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return (float) result;
    }
    public static int divide(int a, int b) throws ArithmeticException {
        //Made by Harry
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        // Shivam - uses divide function created by Harry
        try {
            /*int c = divide(6, 8);
            System.out.println(c);*/
            double ar = area(6);
        }
        catch (Exception e){
            System.out.println("Exception");
        }


    }
}
