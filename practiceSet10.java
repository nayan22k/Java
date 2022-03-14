package com.company;
class Circle{
    public int radius;
    Circle(){
        System.out.println("I am non param of circle");
    }

    public Circle(int r) {
        System.out.println("I am circle parameterized contructor");
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am Cylinder1 parameterized constructor");
        this.height = h;

    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class cwh_52_practiceSet10 {
    public static void main(String[] args) {
        // Problem 1
        //Circle objc = new Circle(12);
        Cylinder1 obj = new Cylinder1(12,4);
    }
}
