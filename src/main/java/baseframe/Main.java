package baseframe;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver d = new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		POM p = new  POM(d);
		p.username.sendKeys("Admin");
		p.password.sendKeys("admin123");
		p.LoginButton.click();
		
		Thread.sleep(5000);
		
		p.PIM.click();
		Thread.sleep(2000);
		
		p.Add.click();
		Thread.sleep(2000);
		
		
		
		// image upload
		File f = new File("C:\\Users\\ujjwa\\Downloads\\222.png");
		// File is predefined class from java .io. package
		p.imageupload.sendKeys(f.getAbsolutePath());
		Thread.sleep(2000);
		
		
		
		
		p.Firstname.sendKeys("mavya");
		Thread.sleep(2000);
		
		
		p.Middlename.sendKeys("harry");
		Thread.sleep(2000);
		
		p.Lastname.sendKeys("patil");
		Thread.sleep(2000);
		
		p.save.click();
		Thread.sleep(2000);
		
	
		
	}

}
