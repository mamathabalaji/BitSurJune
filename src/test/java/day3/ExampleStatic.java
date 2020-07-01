package day3;

public class ExampleStatic<city1> {
    public static String city1 ="Bangalore";
    protected static String state="Karnataka";
    int pincode=560087;

    public static void main(String[] arg) {
        ExampleStatic str = new ExampleStatic();
        System.out.println("capital city" + city1);
        str.capital();
        System.out.println("capital city" + city1);
        //nongi static pincode cannot be acessed here
        // System.out.println("pincode of bangalore"+pincode);

    }

    public void capital()
    { System.out.println("pincode of bangalorein capital method"+pincode);
        System.out.println("capital cityin capital method"+city1);
        pincode=560035;
        city1="hydd";
       System.out.println("capital city22 2nd initialising"+city1);
        System.out.println("pincode of bangalore1"+pincode);
        city1="mumbai";
        System.out.println("3 rd initial"+city1);

    }

}
