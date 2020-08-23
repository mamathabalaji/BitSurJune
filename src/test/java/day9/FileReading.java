package day9;

import java.io.*;

public class FileReading {
    public static void main(String[] args) throws IOException {

        String path=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"mana.txt";
        Reader r=new FileReader(path);
        BufferedReader br=new BufferedReader(r);

        //System.out.println(br.readLine());//this read line if u want multiple line use while condition


        String x="";
        while((x=br.readLine())!=null)
        {System.out.println(x);}




    }
}
