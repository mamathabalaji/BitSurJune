package day10;

import com.google.inject.Key;
import day9.GenericFunction;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class DemoSelenium_xlsx {
    WebDriver driver;

    //driver class load automatically we have to add bonigarcia dependencies in pom.xml file
    //after adding dependency right click maven reload project this automatically download jar file
    // so no need of adding jar all time

    String path = System.getProperty("user.dir") + File.separator + "data" + File.separator + "demo.xlsx";

    Xls_Reader xls = new Xls_Reader(path);
    String st = "Data";  //sheet name
    String name = xls.getCellData(st, "search", 2);


    @Test  //this  is test anotation
    public void open() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //  driver.get("https://www.google.com");//----this open google.com
        //     driver.get(GenericFunction.getValue("url"));
        driver.get(GenericFunction.getValue("TC02", "url"));
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys(name, Keys.ENTER);
        Thread.sleep(5000);
        driver.close();
    }
}
