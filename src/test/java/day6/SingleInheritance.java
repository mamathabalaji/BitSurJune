package day6;

public class SingleInheritance extends B {
    //Inheritance child can inherit parent class
    //single inheritance
    //multilevel inheritance
    //multiple inheritance is not possible , it can be obtained by interface

    public static void main(String[] args)
    {
        SingleInheritance a=new SingleInheritance();
        a.transcript();//right inheritance means reuseability
        a.print();
        a.report();
        System.out.println(a.city);

        //if u create b object u can acess only b class method n c but not a
        B b=new B();//wrong
        b.report();
        b.print();

    }

    public void transcript()
    {
        System.out.println("print Transcript");
    }
}
