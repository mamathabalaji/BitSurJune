package day6;

public class DemoPoly {
    public static void main(String[] args)
    {
        RBI rbi;  //this is reference
        rbi=new SBI();
        System.out.println("Print SBI rate of intrest"+rbi.getIntrest());

        rbi=new ICICI();
        System.out.println("print ICICI rate of intrest"+rbi.getIntrest());
    }

}
