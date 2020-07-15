package day4;

import java.util.Scanner;

public class Switch_Case {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int month;
        month = sc.nextInt();

        switch (month)
        {case 1:
                System.out.println("month is jan");
                break;//  if there is no break it execute all condition after it execute
            case 2:
                System.out.println("month is feb");
                break;
            case 3:
                System.out.println("month is march");
                break;
            case 4:
                System.out.println("month is April");
                break;
            case 5:
                System.out.println("month is May");
                break;
            case 6:
                System.out.println("month is june");
                break;
            default:
                System.out.println("enter correct month");
        }
        System.out.println("finish switchcase");

    }
}








