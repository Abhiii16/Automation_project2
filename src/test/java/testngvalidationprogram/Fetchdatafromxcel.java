package testngvalidationprogram;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Fetchdatafromxcel {

	public static void main(String[] args) throws IOException {
		
		DataFormatter df= new DataFormatter();
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\SeleniumFolder\\testngvalidationprogram\\NewData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		//for fetch particular data from excel
		String text = sheet.getRow(0).getCell(0).getStringCellValue();

		
		System.out.println(text);
		XSSFCell cell = sheet.getRow(0).getCell(1);
		String text1=df.formatCellValue(cell);
		System.out.println(text1);
		

//fetch all data
		int numberofrows=sheet.getLastRowNum();
		System.out.println(numberofrows);
		int numberofcoloumn=sheet.getRow(0).getLastCellNum();
		System.out.println(numberofcoloumn);
		
		
	}

}
