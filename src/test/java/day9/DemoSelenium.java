package day9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoSelenium {
    WebDriver driver;  //driver class load automatically we have to add bonigarcia dependencies in pom.xml file
                       //after adding dependency right click maven reload project this automatically download jar file
    // so no need of adding jar all time


    @Test  //this  is test anotation
    public void open() throws InterruptedException {
     WebDriverManager.chromedriver().setup();
     driver=new ChromeDriver();

   //  driver.get("https://www.google.com");//----this open google.com
   //     driver.get(GenericFunction.getValue("url"));
        driver.get(GenericFunction.getValue("TC02","url"));
     Thread.sleep(3000);
    }
}
