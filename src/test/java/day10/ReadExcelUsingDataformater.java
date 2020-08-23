package day10;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelUsingDataformater {
    public static void main(String[] args) throws IOException {/**
     .xls----hssfWorkbook---hssf-->horible spread sheet format
     .xlsx---xssfworkbook--xss-->exceml spread sheet
     poi(old jxl--suport only xls)*/


        String path = System.getProperty("user.dir") + File.separator + "data" + File.separator + "demo.xlsx";
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        Sheet sheet = wb.getSheetAt(0);

        DataFormatter df = new DataFormatter();  //to read different format String ,int
        String val = df.formatCellValue(sheet.getRow(4).getCell(2));
        System.out.println(val);
    }
}