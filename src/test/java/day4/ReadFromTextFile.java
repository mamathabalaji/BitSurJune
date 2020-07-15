package day4;

import java.io.*;

public class ReadFromTextFile {

    public static void main(String[] args) throws IOException { //        C:\eclipse use\Manasvipavan\Dummy.txt
        String path=System.getProperty("user.dir")+ File.separator+"Dummy.txt";
        //user.dir get path
        System.out.println(path);
        File file = new File(path);//File class
        System.out.println(file.exists()+" Is file exist");
        //reader java io class
        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);
      // String value= br.readLine();  //readline method return string
      //  for(int i=1;i<=6;i++) {
        //   System.out.println(br.readLine());
        String x="";
        while((x=br.readLine())!=null)
        {System.out.println(x);
        }
        }
    }

