package day3;

public class MyCar
{
 public static void main(String[] arg)
 {
     MyCar car=new MyCar();
     car.personalCar("BMW",1234,"blue");


     //different clas static method can be called by class reference
     StudentDetail.detailsOfStudent("Loukya",21,"Science");
 }
  public void personalCar(String name,int num,String color)
  {
      System.out.println("name is "+name);
      System.out.println("num is "+num);
      System.out.println("clor is "+color);
  }
}
