package AsignmentMamtha;


public class ReadAray_lenghtofName
    {
// for(type variable: Arrayname)
        public static void main(String[] args)
        {
            String st="Mamatha balaji";
            String [] std={"Manasvi","Loukya","Pavan","Shilpa","Balaji", "Nanjundappa"};
            System.out.println(std[2]);
            System.out.println("count of char"+st.length());
            System.out.println("count of array"+std.length);

            for(int i=0;i<=std.length;i++)
            {

                System.out.println(std[i] + "   count of name length==" +std[i].length());

            }
        }


}
