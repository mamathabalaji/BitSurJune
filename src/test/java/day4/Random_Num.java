package day4;

public class Random_Num {
    public static void main(String[] args)
    {
        //System.out.println(Math.random());//math.random generate random number every time doubl unique value

        double ran=Math.random();
        System.out.println(ran);
        int mobile=(int)(ran*555555555);//this type casting double ran is convertedinto int type
        System.out.println(mobile);

    }
}
