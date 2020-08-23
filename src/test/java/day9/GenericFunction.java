package day9;

import org.ini4j.Ini;

import java.io.*;
import java.util.Properties;

public class GenericFunction {

    public static String getValue(String key) {
        String value = "";

        try {
            // String path=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"config.properties";
            //FileReader fr=new FileReader(path);
            BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir") + File.separator + "data" + File.separator + "config.properties"));
            Properties prop = new Properties();
            prop.load(br);
            value = prop.getProperty(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }

// ini file getting value

    public static String getValue(String header, String key) {
        String value = "";
        try {
            String path = System.getProperty("user.dir") + File.separator + "data" + File.separator + "dataaaa.ini";

            FileInputStream fis = new FileInputStream(path);
            Ini ini = new Ini();
            ini.load(fis);
            value = ini.get(header,key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;

    }


}
