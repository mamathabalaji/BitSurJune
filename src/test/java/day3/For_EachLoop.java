package day3;

import com.sun.deploy.security.SelectableSecurityManager;

public class For_EachLoop {
    // for(type variable: Arrayname)
    public static void main(String[] args) {
        String st = "Mamatha balaji";
        String[] std = {"Manasvi", "Loukya", "Pavan", "Shilpa", "Balaji", "Nanjundappa"};
        System.out.println(std[2]);
//        System.out.println("count of char"+st.length());
        //       System.out.println("count of array" + std.length);

        for (int i = 0; i <= std.length; i++) {
            //          System.out.println(std[i] + "   count of name length==" + std[i].length());
//        }//

            for (String var : std) {
                System.out.println("for each loop syntax type var string name " + var + "  num of letter  " + std[i].length());
                if(var.equals("Manasvi"))
                {
                    System.out.println("found");
                }
                    else
                    {System.out.println("not found");}

            }
        }

    }
}



