package day6;

public class AcessModifer_Car {
    public static void main(String[] arg)
    {
        System.out.println("default=only within package,public anywhere by extending calss in other package,private withinclass,protected in other package");
        AcessModifer_Car c=new AcessModifer_Car();
        c.door();
        c.headlight();
        c.sunroof();
        c.wheel();
    }
    void wheel()
    {System.out.println("default method wheel");}

    public void door()
    {System.out.println("public method door");}

    private void sunroof()
    {
        System.out.println("private method  sunroof");
    }

    protected void headlight()
    {
      System.out.println("protected method headlight");
    }
}
