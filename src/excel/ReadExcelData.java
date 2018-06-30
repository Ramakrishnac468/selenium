package excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData 
{
	public static void main(String[] args) throws IOException 
	{
		String str="D:\\Softwares\\ExcelData\\TestData.xlsx";
		FileInputStream fis=new FileInputStream(str);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		//XSSFRow row=sheet.getRow(0);
		//XSSFCell cell=row.getCell(0);
	
		/*System.out.print(sheet.getRow(0).getCell(0));
		System.out.println(sheet.getRow(0).getCell(1));
		System.out.print(sheet.getRow(1).getCell(0));
		System.out.println(sheet.getRow(1).getCell(1));
		System.out.print(sheet.getRow(2).getCell(0));
		System.out.println(sheet.getRow(2).getCell(1));
		System.out.print(sheet.getRow(3).getCell(0));
		System.out.println(sheet.getRow(3).getCell(1));*/
		
		String str2=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.print(str2);
		String str3=sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println(str3);
	}

}
