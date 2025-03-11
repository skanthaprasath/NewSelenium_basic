package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readmethod {
		public static String uti(String xlsheet,int xlrow,int xlcell) throws IOException {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Testdata\\Book1.xlsx");
			XSSFWorkbook ws = new XSSFWorkbook(file);
			XSSFSheet s = ws.getSheet(xlsheet);
			XSSFRow row = s.getRow(xlrow);
			XSSFCell cell=row.getCell(xlcell);
			String data;
			try {
				DataFormatter d = new DataFormatter();
				data = d.formatCellValue(cell);
			}
			catch(Exception e){
				data="";
			}
			return data;
			
		}
}
