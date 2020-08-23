package day9;

import java.io.*;

public class FileHandlingProg {

    //four types of file .property,ina,xls,xlsc

    public static void main(String[] args) throws IOException {
        //absolute path is from root
       // C:\eclipse use\Manasvipavan\data

        //String path=System.getProperty("user.dir");
        //System.out.println(path);//give path till manasvipavan
        //fileseparator take care of /
        String path=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"mana.txt";
        System.out.println(path);
        File files = new File(path);//these two line create file
        files.createNewFile();

        String Myos=System.getProperty("os.name");//gives ur os details

        System.out.println(Myos);

        //how to write to file
        Writer wr=new FileWriter(path);

        BufferedWriter bw=new BufferedWriter(wr);
        bw.write("Hello all");
        bw.newLine();
        bw.write("loukya pavan");
        bw.flush();
        bw.close(); //whenever writing close the file




    }
}
