package keyword_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Mainclass {

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub

		
	FileInputStream f = new FileInputStream(new File("C:\\Users\\ujjwa\\OneDrive\\Desktop\\Documents\\keyword_driven.xlsx"));
		XSSFWorkbook w = new XSSFWorkbook(f);
		XSSFSheet sh = w. getSheet("Sheet1");
		XSSFCell c ;
		
		for (int i=1 ; i<= sh.getLastRowNum();i++)
		{
			// keyword = openBrowser               column = cell
			String keyword =sh.getRow(i).getCell(1).getStringCellValue();
			
			//locatortype= no data
			String locatortype = sh.getRow(i).getCell(2).getStringCellValue();
			
			
			String locatorvalue = sh.getRow(i).getCell(3).getStringCellValue();
			
			
			String testdata = sh.getRow(i).getCell(4).getStringCellValue();
			    //  Row 1 , Column 4 
			
			
			switch (keyword)   // geturl
			{
			case  "openBrowser" -> Actionkeyword.openBrowser(testdata);
			case  "getURL" -> Actionkeyword.getURL(testdata);
			case "EnterText" -> Actionkeyword.EnterText(locatortype, locatorvalue, testdata);
			case "onClick" -> Actionkeyword.onClick(locatortype, locatorvalue);
			default -> throw new Exception ("you selected wrong option");
			
			
			};
			
			
			
			
		}
		
		
		
	}

}
