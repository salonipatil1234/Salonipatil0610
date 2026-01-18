package baseframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {

	// POM is used java beans concepts 
	
	//page object model (POM) is base framework 
	// it is used to store Xpath in one class and then call that xpath in other class
	
	private WebDriver d ;
	
	// parameterized constructor
	POM (WebDriver d)
	{
		this.d=d ;
		PageFactory.initElements(d, this);
		
	}
	
	//@findBy is predefined annotation from org.openqa.selenium package
	// it is used to store xpath in the obj of element 
	
	@FindBy (xpath = "//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement LoginButton;
	
	
	@FindBy(xpath = "//a[contains(.,'PIM')]")
	WebElement PIM ;
	
	@FindBy(xpath = "//button[contains(.,'Add')]")
	WebElement Add;
	
	@FindBy(xpath = "//input[@name='firstName']")
	WebElement Firstname;
	
	@FindBy(xpath = "//input[contains(@name,'middleName')]")
	WebElement Middlename;
	
	@FindBy(xpath = "//input[@name='lastName']")
	WebElement Lastname;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement save;
	
	@FindBy(css = "input[type='file']")
	WebElement imageupload;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
