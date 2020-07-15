package day4;

public class Generate_Mobile {
    public static void main(String[] args)
    {
      Generate_Mobile m=new Generate_Mobile();
       int x= m.generateMobilenum();

       System.out.println(x);
       long l=m.lgenerateMobilenum();
       System.out.println(l);
        String  pan=genPan();
        System.out.println(pan+"generated pan");
        System.out.println(email());


    }
    public static int generateMobilenum()
    { double ran=Math.random();
        int mob= (int)(ran*9999999);
        System.out.println("before return we can print but not after return"+mob);
        return mob;
    }
    public long lgenerateMobilenum()
    { double ran=Math.random();
        long mob= (long)(ran*9999999999999l);
        System.out.println("before return we can print but not after return long"+mob);
        return mob;
    }

    public static String genPan()
    {  // format asfg1234klm
        String first="ASFG";
        String last="KLM";
        double ran=Math.random();
        int mid=(int)(ran*9999);
        String genpannum= first+mid+last;
        return genpannum;
    }

    public static String email()
    {
        String start="Generate";
        double ran2=Math.random();
        int num=(int)(ran2*3434);
        String email=start+num+"mamatharaj.g@gmail.com";
        return email;

    }

}
