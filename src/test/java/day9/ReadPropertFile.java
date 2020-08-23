package day9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class ReadPropertFile {
    //we generally read from property file it can fetch url  db details
    //fileinputstram is in bits slow so go  to buffer reader

    public static void main(String[] args) throws Exception {

        String path=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"config.properties";
        FileReader fr=new FileReader(path);
        BufferedReader br= new BufferedReader(fr);
        Properties prop=new Properties();
        prop.load(br);
        prop.getProperty("url");
        String val=prop.getProperty("url");
        System.out.println(val);
        String browser=prop.getProperty("browser");
        System.out.println(browser);

    }
}
