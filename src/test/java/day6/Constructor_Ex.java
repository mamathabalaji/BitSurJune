package day6;

public class Constructor_Ex
{
    //default constructor no return type same as class name when u create object constructor will execute
    //constructor can be public can have any number of constructor its impicityly called
    //constructor overloading
    //scanner class is also parameterised constructor accept input
    //if two object created can access same constructor
    // method overloading
    //used when u want to initialize in class level
    Constructor_Ex()
    {
        System.out.println("default constructor");

    }
    Constructor_Ex(String book,int reg)
    {
        System.out.println("parameter constructor");
        System.out.println("i love reading book"+book);
        System.out.println("reg nmb"+reg);


    }
    public static void main(String[] args) {

        Constructor_Ex c = new Constructor_Ex();
        Constructor_Ex c1=new Constructor_Ex("java",23);
        Constructor_Ex c2=new Constructor_Ex();

        //overloading constructor with different parameter
        //automatically constructor is initialised no return type for constructor

    }
}
