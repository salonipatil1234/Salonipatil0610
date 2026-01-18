package baseframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		facebook f = new facebook (d);
		f.emailid.sendKeys("abc@gmail.com");
		f.pass.sendKeys("abc@1234");
		f.Login.click();
		
		Thread.sleep(2000);
		
		
		
		
		
		
	}

}
