package day3;

public class StudentDetail
{   static String  city="hyd";

    public static void main(String[] arg)
    {  //static methods can be called directly without creating object

        detailsOfStudent("mamatha",22,"maths");

        MyCar car1=new MyCar();
        car1.personalCar("benz",1432,"white");
        System.out.println("city in main name is "+city);
    }

    public static void detailsOfStudent(String name,int roll,String sub)
    {
        System.out.println("name is "+name);
        System.out.println("rollnum is "+roll);
        System.out.println("sub is "+sub);
        System.out.println("static varible city"+city);
    }

}
