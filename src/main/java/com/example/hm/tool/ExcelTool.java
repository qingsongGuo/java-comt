package com.example.hm.tool;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ExcelTool implements ExcelService{
    public static boolean isExcel2003(String filePath) {
        return filePath.matches("^.+\\.(?i)(xls)$");
    }

    public static boolean isExcel2007(String filePath) {
        return filePath.matches("^.+\\.(?i)(xlsx)$");
    }

    public List<UserInfo> importData() {
        List<UserInfo> userList = new ArrayList();
        String xmlPath = "/Users/gqs/java_work/java-comt/src/main/resources/static/test.xlsx";
        try {
            Workbook workbook = new XSSFWorkbook(new FileInputStream(xmlPath));


            Sheet dataTypeSheet = workbook.getSheetAt(0);
            int rows_i=dataTypeSheet.getPhysicalNumberOfRows(); //4
            int rows_j =dataTypeSheet.getLastRowNum(); //3
            for (int i = 1;i<dataTypeSheet.getLastRowNum();i++){
                Row row = dataTypeSheet.getRow(i);
                String name = row.getCell(0).getStringCellValue();
                double iphone = row.getCell(1).getNumericCellValue();
                System.out.println("name : "+name);
                System.out.println("iphone : "+iphone);
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userList;
    }

//    public interface getCellValue(XSSFCell cell){
//        if (cell.getCellType() == XSSFCell.CELL_TYPE_BLANK) {
//            return ""
//        } else if (cell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
//            return cell.getBooleanCellValue();
//        } else if (cell.getCellType() == XSSFCell.CELL_TYPE_ERROR) {
//            return cell.getErrorCellValue();
//        } else if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
//            return cell.getNumericCellValue();
//        } else if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
//            return cell.getStringCellValue();
//        } else {
//            return cell.getStringCellValue();
//        }
//    }
}