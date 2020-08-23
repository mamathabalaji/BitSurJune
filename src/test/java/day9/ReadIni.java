package day9;

import org.ini4j.Ini;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadIni {
    public static void main(String[] args) throws IOException {

        String path=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"dataaaa.ini";

        FileInputStream fis=new FileInputStream(path);
        Ini ini =new Ini();
        ini.load(fis);
        String url=ini.get("TC02","url");
        System.out.println(url);


        
    }
}
