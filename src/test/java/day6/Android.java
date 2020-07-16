package day6;

public class Android extends Mobile{
    void scroll()
    {
        System.out.println("Android Scrol");

    }

    void swipe()
    {
        System.out.println("swipe in android");
    }

    public static void main(String[] args)
    { Android ai=new Android();
        ai.scroll();
        ai.swipe();
    }}
