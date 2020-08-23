package day10;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFromExcel {
    public static void main(String[] args) throws IOException {/**
     .xls----hssfWorkbook---hssf-->horible spread sheet format
     .xlsx---xssfworkbook--xss-->exceml spread sheet
     poi(old jxl--suport only xls)*/


    System.out.println(System.getProperty("user.dir"));

    String path=System.getProperty("user.dir")+ File.separator+"data"+File.separator+"demo.xlsx";
    FileInputStream fis=new FileInputStream(path);
   XSSFWorkbook wb=new XSSFWorkbook(fis);
   Sheet sheet=wb.getSheetAt(0);
   String value=sheet.getRow(2).getCell(2).getStringCellValue();// if there is numeric value it cant read so give
        //illegalstateException if u put single cote convert to string

   System.out.println(value);




    }
    }

