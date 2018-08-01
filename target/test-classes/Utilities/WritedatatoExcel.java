package day9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WritedatatoExcel {
  @Test
  public void writeData() throws IOException {
	  XSSFWorkbook workbook=new XSSFWorkbook();
	  XSSFSheet sheet=workbook.createSheet();
	  
	  
	  for (int i = 0; i <=5; i++) {
		XSSFRow row = sheet.createRow(i);
		XSSFCell cell = row.createCell(0);
		cell.setCellValue("SNO");
		XSSFCell cell1 = row.createCell(1);
		cell1.setCellValue("names");
	}
	FileOutputStream ops=new FileOutputStream(new File("./Data/new2.xlsx"));
	  workbook.write(ops);
	  workbook.close();
	  
  }
}
