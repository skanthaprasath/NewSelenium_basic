package Utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datamethod {
	public static FileInputStream fs;
	public static FileOutputStream os;
	public static XSSFWorkbook book;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static String datautil(String xlsheet,int xlrow,int xlcell) throws IOException
	{
		fs = new FileInputStream(System.getProperty("user.dir")+"\\Testdata\\Book1.xlsx");
		book = new XSSFWorkbook(fs);
		sheet = book.getSheet(xlsheet);
		row = sheet.getRow(xlrow);
		cell=row.getCell(xlcell);
		
		String data;
		try
		{
			DataFormatter d = new DataFormatter();
			
			data = d.formatCellValue(cell);
		}
		catch(Exception e)
		{
			data="";
		}
		book.close();
		fs.close();
		return data;
	}
}
