package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelDriven {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		
		
FileInputStream f=new FileInputStream(new File("C:\\Users\\ujjwa\\OneDrive\\Desktop\\Book1.xlsx"));
		
		XSSFWorkbook w=new XSSFWorkbook(f);
		
		XSSFSheet sh=w.getSheetAt(1);
		
		XSSFCell c;
		
		WebDriver d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(12000);
		
		for(int i=1; i<=sh.getLastRowNum();i++)
		{
			c=sh.getRow(i).getCell(0);
			//Row 1, Column 0 
			c.setCellType(CellType.STRING);
		d.findElement(By.xpath("//input[@name='username']")).sendKeys(c.getStringCellValue());
		Thread.sleep(2000);
		
		
		c=sh.getRow(i).getCell(1);
		//Row 1, Column  1
		c.setCellType(CellType.STRING);
	
		d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(c.getStringCellValue());
		Thread.sleep(2000);
		
		
		d.findElement(By.xpath("//button[contains(.,'Login')]")).click();
		Thread.sleep(2000);
		
			
			
			
		
		
	}

	}
	}
