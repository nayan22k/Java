package com.company;

class EkClass{
    int a;

    public int getA() {
        return a;
    }

    EkClass(int a){
        this.a = a;
    }
    public int returnone(){
        return 1;
    }
}
class DoCLass extends EkClass{
    DoCLass(int c){
        super(c);
        System.out.println("I am a constructor");
    }
}

public class SuperClass {
    public static void main(String[] args) {
        EkClass e = new EkClass(65);
        DoCLass d = new DoCLass(5);
        System.out.println(e.getA());

    }
}
