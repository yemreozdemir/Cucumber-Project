package com.cydeo.apachePOI_read_write_excel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead {

    @Test
    public void read_from_excel_file() throws IOException {
        String path = "SampleData.xlsx";
        File file = new File(path);
        // to read from excel, we need to load it to FileInputStream
        FileInputStream fileInputStream = new FileInputStream(path);

        // workbook>sheet>row>cell

        // create a workbook
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        // we need to get specific sheet from currently opened workbook
        XSSFSheet sheet = workbook.getSheet("Employees");

        // select row and cell
        // print out Marry's cell
        // indexes start from zero(0)
        System.out.println(sheet.getRow(1).getCell(0));

        // print out developer
        System.out.println(sheet.getRow(3).getCell(2));

        // return the count of used cells only
        // starts counting from 1
        int usedRows = sheet.getPhysicalNumberOfRows();
        System.out.println("usedRows = " + usedRows);

        // returns the number from top cell to bottom cell
        // it does not care if the cell is empty or not
        // starts counting from 0
        int lastUsedRow = sheet.getLastRowNum();
        System.out.println("lastUsedRow = " + lastUsedRow);

        // TODO: Create a logic to print Vinod's name
        for(int rowNum=0; rowNum<usedRows; rowNum++){
            if(sheet.getRow(rowNum).getCell(0).toString().equals("Vinod")){
                System.out.println(sheet.getRow(rowNum).getCell(0));
            }
        }

        // TODO: Create a logic to print out Linda's Job_ID
        // we are gonna check if name is Linda===>print out Job_ID of Linda
        for(int rowNum=0;rowNum<usedRows;rowNum++){
            if(sheet.getRow(rowNum).getCell(0).toString().equals("Linda")){
                System.out.println("Linda's Job_IS is: "+sheet.getRow(rowNum).getCell(2));
            }
        }




    }
}
