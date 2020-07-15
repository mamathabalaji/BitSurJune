package day3;

public class InnerLoop {
    public static void main(String[] args)
    {
        for (int i = 0; i <= 5; i++)
        {
            System.out.println("outer loop i" + i);


            for (int j = 0; j <6;j++)
            {
                           System.out.println("inner loop j" +j);
            }

        }
    }
}
