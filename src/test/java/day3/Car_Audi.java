package day3;

import day6.AcessModifer_Car;

import java.util.concurrent.Callable;

public class Car_Audi extends AcessModifer_Car {
    public static void main(String[] args)
    {
        Car_Audi a=new Car_Audi();
        a.door();
        a.headlight();
    }
}

