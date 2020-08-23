package day10;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Read_Full_Excel_Dataformat {
    public static void main(String[] args) throws IOException {/**
     .xls----hssfWorkbook---hssf-->horible spread sheet format
     .xlsx---xssfworkbook--xss-->exceml spread sheet
     poi(old jxl--suport only xls)*/


        String path = System.getProperty("user.dir") + File.separator + "data" + File.separator + "demo.xlsx";
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        Sheet sheet = wb.getSheetAt(0);

        DataFormatter df = new DataFormatter();  //to read different format String ,int

        int rowNum=sheet.getLastRowNum();
        for(int i=0;i<rowNum;i++)
        {
        String name = df.formatCellValue(sheet.getRow(i).getCell(0));
        String city = df.formatCellValue(sheet.getRow(i).getCell(1));
        String pin= df.formatCellValue(sheet.getRow(i).getCell(2));

        System.out.println(name +"-----"+city +"----"+pin+"-----");
    }
}
}
