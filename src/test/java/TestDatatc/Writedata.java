package TestDatatc;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writedata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\Testdata\\excel_dy.xlsx");
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("Data1");
		XSSFRow row = sheet.createRow(0);
			row.createCell(0).setCellValue("Username");
			row.createCell(1).setCellValue("Pasword");
			XSSFRow row1 = sheet.createRow(1);
			row1.createCell(0).setCellValue("Admin");
			row1.createCell(1).setCellValue("admin123");
			XSSFRow row2 = sheet.createRow(2);
			row2.createCell(0).setCellValue("natlagent");
			row2.createCell(1).setCellValue("Agent007");
			
		book.write(file);
		book.close();
		file.close();
	    System.out.println("copleted");
	}

}
