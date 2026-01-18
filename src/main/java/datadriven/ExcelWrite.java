package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelWrite {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

FileInputStream f=new FileInputStream(new File("C:\\Users\\ujjwa\\OneDrive\\Desktop\\Book1.xlsx"));
		
		XSSFWorkbook w=new XSSFWorkbook(f);
		
		XSSFSheet sh=w.getSheetAt(1);
		
		Cell c;

		
		for(int i=1; i<=sh.getLastRowNum();i++)
		{
			Row r = sh.getRow(0);
			
			if (r==null)
			{
			r  =sh.createRow(i);
			//Row 1 
			}
		
			
			c = r.createCell(2);// column 2 
			c.setCellValue("Test status");
			
			
			FileOutputStream fo = new FileOutputStream("C:\\\\Users\\\\ujjwa\\\\OneDrive\\\\Desktop\\\\Book1.xlsx");
			
			w.write(fo);
			
			
			
		
	}

	}
}














