package org.example;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class LoadProp {
    static Properties prop;
    static FileInputStream input;
    static String fileName = "TestDataConfig.properties";
    static String fileLocation = "_";

    public String getProperty(String key) {
        prop = new Properties();
        try {
            input = new FileInputStream(fileLocation + fileName);
            prop.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }

    @Test
    public void readingKey()
    {
        System.out.println(getProperty("url"));
    }


     @Test
    public static void readExcel ()throws Exception
    {
        File file = new File("C:\\Users\\Welcome\\Desktop\\Krunalbhai\\RawData.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet1 = wb.getSheetAt(0);
        String data1 = sheet1.getRow(0).getCell(0).getStringCellValue();// store
        System.out.println("Data from Excel is "+data1);

    }
}
