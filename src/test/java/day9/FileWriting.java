package day9;

import java.io.*;

public class FileWriting {
    public static void main(String[] args) throws IOException {

        String path=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"mana.txt";
        Writer w=new FileWriter(path);
        BufferedWriter bw=new BufferedWriter(w);

        String name[]={"mam","pav","balaji"};

        for(int i=0;i<name.length;i++)
        {
           bw.write(name[i]);
           bw.newLine();

        }
        bw.flush(); //to save the file
        bw.close();
    }



}
