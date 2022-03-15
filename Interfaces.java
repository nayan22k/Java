package com.company;

interface Bicylce{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int decrement);
}

interface HornBicycle{
    int a = 45;
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle{
    public boolean a;

    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi Khushi kabhi gum pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon na po po po po");
    }
}

public class cwh_54_interfaces {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(1);
        System.out.println(cycleHarry.a);  // you can create properties in Interfaces
        //System.out.println(cycleHarry.a);  // you cannot modify properties in Interfaces as they are final

        cycleHarry.blowHornK3g();
        cycleHarry.blowHornmhn();
    }
}
