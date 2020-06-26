package day2;

import com.sun.javaws.progress.PreloaderPostEventListener;

import java.util.Arrays;

public class StringManipulation {
    public static void main(String arg[])
    {
        String name="Loukya_ pavan";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.split("_")[0]);
        System.out.println(name.split("_")[1]);
        System.out.println(name.replace("Lo","ma"));




    }
}
