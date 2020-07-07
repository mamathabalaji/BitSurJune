package day3;

import java.util.Scanner;

public class ScannerCls {

    public static void main(String[] args)
    {   //class to read input
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your marks");
        int marks=sc.nextInt();
        System.out.println("marks entered by user"+marks);

        if(marks<=35)
        {System.out.println("failed");
        }
         else if(marks>=35 && marks<=40)
        {System.out.println("just pass");
        }
         else if(marks>=40 && marks<=50)
        {System.out.println("second class");}

         else if(marks>=50 && marks<=75)
        {System.out.println("first class");}

         else if (marks>=75 && marks<=80)
        {System.out.println("Destinction");}

         else if(marks>=80 && marks<=100)
        {System.out.println("topper");}

         else
        {System.out.println("contact admin");}


    }
}
