package TestDatatc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class data_TC1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Testdata\\Book1.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("Sheet1");
		int totalrow = sheet.getLastRowNum();
		int totalcells = sheet.getRow(1).getLastCellNum();
		System.out.println(totalrow);
		System.out.println(totalcells);
		
		for(int r =0;r<totalrow;r++)
		{
			XSSFRow row = sheet.getRow(r);
			for(int c=0;c<totalcells;c++)
			{
				XSSFCell cell = row.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		
		book.close();
		file.close();
		
	}

}
