package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel 
{
	public static void main(String[] args) throws IOException 
	{
FileInputStream fis=new FileInputStream("D:\\Softwares\\ExcelData\\TestData.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		//XSSFRow row=sheet.getRow(0);
		//XSSFCell cell=row.getCell(0);
		sheet.getRow(0).createCell(2).setCellValue("pass");
		sheet.getRow(1).createCell(2).setCellValue("fail");
		
		FileOutputStream fos=new FileOutputStream("D:\\Softwares\\ExcelData\\TestData.xlsx");
		workbook.write(fos);
		workbook.close();
	}

}
