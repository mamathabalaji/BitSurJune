package day9;

public class ReadProp1 {
    public static void main(String[] args) {


  //*
         String url=GenericFunction.getValue("url");
    String brow=GenericFunction.getValue("browser");

        System.out.println(url);
        System.out.println(GenericFunction.getValue("browser") );

        if (brow.equals("chrome"))
        {
            System.out.println("opening in chrome");
            System.out.println(url);
        }else if (brow.equals("firefox"))
        {
            System.out.println("opening in firefox");
            System.out.println(url);
        }


    }
}
