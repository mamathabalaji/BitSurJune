package day10;

import java.io.File;

public class Read_Using_Library {
    public static void main(String[] args) {

        String path=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"demo.xlsx";

        Xls_Reader xls=new Xls_Reader(path);
        String st="demo";  //sheet name
        String name=xls.getCellData(st,"pincode",2);
        String name1=xls.getCellData(st,"city",2);
        String name2=xls.getCellData(st,"Name",2);
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);

    }
}

