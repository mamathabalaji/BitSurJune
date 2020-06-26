package day1;

import java.io.*;
public class LogicalOperatorReadingText {

    public static void main(String[] args) throws IOException
    {
        String path = "C://eclipse use//Manasvipavan//Test.txt";
        /* u can get pat by copy-->absolute path give coreect path//no spaec*/
        Reader read;
        read = new FileReader(path);
        BufferedReader br=new BufferedReader(read);
        String x;
        while((x=br.readLine())!=null)
        {
            System.out.println(x);
        }
    }
}


