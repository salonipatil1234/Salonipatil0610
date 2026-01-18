package baseframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebook {

	
	private WebDriver d;
	
	facebook(WebDriver d){
		
		this.d=d;
		PageFactory. initElements(d,this);
		
		
	}
	@FindBy(xpath = "//input[@name='email']")
	WebElement emailid;
	
	@FindBy(xpath = "//input[@name='pass']")
	WebElement pass;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Login;
	
	
	
	
	
}
