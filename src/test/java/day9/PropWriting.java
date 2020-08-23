package day9;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
public class PropWriting {


        public static void main(String[] args) throws IOException
        {

            String path = System.getProperty("user.dir") + File.separator + "data" + File.separator + "config.properties";
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            Properties prop = new Properties();
            prop.setProperty("url", "https://www.google.com");
            prop.setProperty("db","Staging");
            prop.setProperty("environment","production");
            prop.setProperty("device","Android");
            prop.store(bw, "properties");

        }
}

