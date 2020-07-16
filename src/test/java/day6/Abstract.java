package day6;

public class Abstract extends MinOfRailway{
    //no implementation only method declaration
    //Abstract class can contain both method
    //Abstract method to hide logic only method can be used logic can be hidden

    public void broudGauge() {
        System.out.println("BRoudGauge in child class");
    }

    void metro()
    {
        System.out.println("Banglore metro");
    }
    public static void main(String[] args)
    {
        Abstract a=new Abstract();
        a.broudGauge();
        a.metro();
        a.irtc();
    // u cannot crete Minofrailway class obj bz its Abstractclass
       // MinOfRailway m=new MinOfRailway()

        MinOfRailway m=new Abstract();// u cant acess child metro child class pointing to parent
        m.broudGauge();
        m.irtc();
    }


}
