package com.company;

class Phone{
    public void showTime(){
        System.out.println("Time is 8AM");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing Music..");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
    //    Phone obj = new Phone(); // Allowed
    //    SmartPhone smobj = new SmartPhone(); // Allowed
    //    obj.name();

        Phone obj = new SmartPhone(); // Yes it is allowed
    //    SmartPhone obj2 = new Phone(); //Not Allowed

        obj.showTime();
        obj.on();
    //    obj.music(); Not Allowed

    }
}
