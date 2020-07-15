package day4;

import day6.AcessModifer_Car;

public class Audi extends AcessModifer_Car {
    public static void main(String[] args)
    {
        Audi a=new Audi();
        System.out.println("in class audi only public n protected can be acesses it is in different package day4 n car is in day6 package so no default");
        a.door();
        a.headlight();
    }
}
