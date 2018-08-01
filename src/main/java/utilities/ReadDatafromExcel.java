package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDatafromExcel {
  @Test
  public void readData() throws IOException {
	  int n=0;
	  FileInputStream fis=new FileInputStream(new File("./Data/new.xlsx"));
	  XSSFWorkbook workbook=new XSSFWorkbook(fis);
	  XSSFSheet sheet=workbook.getSheetAt(0);
	 // System.out.println(sheet.getSheetName());
	  int rowcount=sheet.getLastRowNum();
	 // =sheet.getRow(1);
	 // int columncount=row.getLastCellNum();
	  
	  for (int i = 1; i <=rowcount; i++) {
		 
		  XSSFRow row=sheet.getRow(i);
		  for(int j=0;j<n;j++)
		  {
		XSSFCell username = row.getCell(0);
		System.out.println("Passed content is:" + username.getStringCellValue());
		XSSFCell password = row.getCell(1);
		System.out.println("Passed content is:" + password.getStringCellValue());

		
	}
		  
	  }
	}
	  
	  
  }

