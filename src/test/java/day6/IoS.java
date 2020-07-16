package day6;

public class IoS extends Mobile {
    void scroll() {
        System.out.println("IOS scroll");
    }

    void swipe() {

        System.out.println("IOS swipe");

    }
    public static void main(String[] args)
    {
        IoS i=new IoS();
        i.scroll();
        i.swipe();
    }
}
