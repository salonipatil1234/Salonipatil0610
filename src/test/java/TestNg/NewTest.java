package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	
	WebDriver d;
	String url="https://marriageking.com/";
  @Test
  
  public void f() {
  }
  
  
  
  @BeforeMethod
  public void mousehover() throws InterruptedException {
	  
	  System.err.println("Before Methods");
	  Actions a=new Actions(d);
	  
	  WebElement login=d.findElement(By.xpath("//a[@id='open-login-modal']"));
	  a.moveToElement(login).perform();
	  Thread.sleep(2000);
	  
	  a.moveToElement(d.findElement(By.xpath("(//a[@title='Register Free'])[1]"))).perform();
     Thread.sleep(2000);
  }

  @AfterMethod
  public void afterMethod() {System.err.println("After Methods");
  }

  @BeforeClass
  public void signup() throws InterruptedException { 
	  
	  System.err.println("BeforeClass");
	  
	  
	  d.manage().window().fullscreen();
	  
	  WebElement gender=d.findElement(By.xpath("//select[@id='register-gender']"));
	  Select s1=new Select(gender);
	  s1.selectByVisibleText("Male");
	  
	 // new Select(d.findElement(By.xpath(""))).selectByVisibleText("Male");
	  d.findElement(By.xpath("//input[@id='reg-fname']")).sendKeys("Abcd");
	  Thread.sleep(2000);
	  
	 d.findElement(By.xpath("//input[@id='reg-lname']")).sendKeys("xyz");
	 Thread.sleep(2000);
	 
	 WebElement religion =d.findElement(By.xpath("//select[@id='cp-religion']"));
	  Select s2 =new Select(religion);
	  s2.selectByVisibleText("Hindu");
	 
	  d.findElement(By.xpath("//input[@id='filter-caste']")).sendKeys("Aagari");
		 Thread.sleep(2000); 
		 
		 d.findElement(By.xpath("//button[contains(.,'Date Of Birth')]")).click(); 
	
	  
	new Select(d.findElement(By.xpath("//select[@id='reg-dob-day']"))).selectByVisibleText("3");  
	new Select(d.findElement(By.xpath("//select[@id='reg-dob-month']"))).selectByVisibleText("Jan");  
	new Select(d.findElement(By.xpath("//select[@id='reg-dob-year']"))).selectByVisibleText("2006");
	
	 d.findElement(By.xpath("//button[@id='set-dob-btn']")).click();
	 Thread.sleep(2000);
	 
	 d.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("marathi");
	 new Select(d.findElement(By.xpath("//select[@id='reg-mobile-ctry']"))).selectByVisibleText("India"); 
	 d.findElement(By.xpath("//input[@id='reg-mobile']")).sendKeys("9822155958");
	 
	 
	// d.manage().window().fullscreen();
	 
	 
  }

  @AfterClass
  public void afterClass() {System.err.println("AfterClass");
  }

  @BeforeTest
  public void loginformauto() throws InterruptedException {
	  System.err.println("BeforeTest");

	  d.findElement(By.xpath("//a[@id='open-login-modal']")).click();
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//input[@id='username']")).sendKeys("abcd");
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//input[@id='userpassword']")).sendKeys("12344");
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//input[@value='Login']")).click();
	  Thread.sleep(2000);
	  
	  d.navigate().refresh();
	  
	 // d.navigate().back();
	 // d.navigate().forward();
  }

  @AfterTest
  public void afterTest() {System.err.println("AfterTest");
  }

  @BeforeSuite
  public void setup() throws InterruptedException {
	  System.err.println("BeforeSuite");


	  
	  d=new ChromeDriver();
	  d.get(url);
	//  d.manage().window().maximize();
	  d.manage().window().fullscreen();
	  Thread.sleep(5000);
  }

  

  @AfterSuite
  public void afterSuite() {System.err.println("AfterSuite");
  }

}
