package bdd;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Multiplescenariotesthrm {
	
	WebDriver d ;
	String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	

	@Given(": will are on login form")
	public void will_are_on_login_form() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    d= new ChromeDriver();
	    d.get(URL);
	    Thread.sleep(8000);
	    d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	}

	@When(": will enter valid username in username field")
	public void will_enter_valid_username_in_username_field() {
	    // Write code here that turns the phrase above into concrete actions
	   d.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("admin");
	}

	@And(":will enter valid password in password field")
	public void will_enter_valid_password_in_password_field() {
	    // Write code here that turns the phrase above into concrete actions
	 d.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	}

	@Then(": will click on login button")
	public void will_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
	
//--------------------------------------------------------------------
	@When(": we will  mouse hover on admin option")
	public void we_will_mouse_hover_on_admin_option() {
	    // Write code here that turns the phrase above into concrete actions
		//new Actions(d).moveToElement(d.findElement(By.xpath("//a[contains(.,'Admin')]"))).perform()
 Actions a=new Actions(d);
	    
	    WebElement admin=d.findElement(By.xpath("//a[contains(.,'Admin')]"));
	    a.moveToElement(admin).perform();

	}
         
	@And(": we will mouse hover on PIM option")
	public void we_will_mouse_hover_on_pim_option() {
	    // Write code here that turns the phrase above into concrete actions
		new Actions(d).moveToElement(d.findElement(By.xpath("//a[contains(.,'PIM')]"))).perform();

	}

	@When(": we will mouse hover on Leave option")
	public void we_will_mouse_hover_on_leave_option() {
	    // Write code here that turns the phrase above into concrete actions
		new Actions(d).moveToElement(d.findElement(By.xpath("//a[contains(.,'Leave')]"))).perform();

	}

	@And(": we will mouse hover on Time option")
	public void we_will_mouse_hover_on_time_option() {
	    // Write code here that turns the phrase above into concrete actions
		new Actions(d).moveToElement(d.findElement(By.xpath("//a[contains(.,'Time')]"))).perform();

	}

	@When(":we will mouse hover on recruitment option")
	public void we_will_mouse_hover_on_recruitment_option() {
	    // Write code here that turns the phrase above into concrete actions
		new Actions(d).moveToElement(d.findElement(By.xpath("//a[contains(.,'Recruitment')]"))).perform();

	}

	@And(": we wil mouse hover on my info option")
	public void we_wil_mouse_hover_on_my_info_option() {
	    // Write code here that turns the phrase above into concrete actions
		new Actions(d).moveToElement(d.findElement(By.xpath("//a[contains(.,'My Info')]"))).perform();

	}

	@When(": we will mouse hover on performance option")
	public void we_will_mouse_hover_on_performance_option() {
	    // Write code here that turns the phrase above into concrete actions
		new Actions(d).moveToElement(d.findElement(By.xpath("//span[contains(.,'Performance')]"))).perform();

	}

	@And(": we will mouse hover on directory option")
	public void we_will_mouse_hover_on_directory_option() {
	    // Write code here that turns the phrase above into concrete actions
		new Actions(d).moveToElement(d.findElement(By.xpath("//span[contains(.,'Directory')]"))).perform();

	}

	@When(": we will mouse hover on maintencence option")
	public void we_will_mouse_hover_on_maintencence_option() {
	    // Write code here that turns the phrase above into concrete actions
		new Actions(d).moveToElement(d.findElement(By.xpath("//a[contains(.,'Maintenance')]"))).perform();

	}

	@And(": we will mouse hover on claim option")
	public void we_will_mouse_hover_on_claim_option() {
	    // Write code here that turns the phrase above into concrete actions
		new Actions(d).moveToElement(d.findElement(By.xpath("//span[contains(.,'Claim')]"))).perform();

	}

	@Then(": we will mouse hover on Buzz option")
	public void we_will_mouse_hover_on_buzz_option() {
	    // Write code here that turns the phrase above into concrete actions
		new Actions(d).moveToElement(d.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[11]"))).perform();

	}
//--------------------------
	@When(": we will navigate to PIM option and click on add button")
	public void we_will_navigate_to_pim_option_and_click_on_add_button() {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.xpath("//a[contains(.,'PIM')]")).click();
	    d.findElement(By.xpath("//button[contains(.,'Add')]")).click();
	}

	@And("^: we will enter (.*) in firsename field$")
	public void we_will_enter_firstname_in_firsename_field(String fname) {
	    // Write code here that turns the phrase above into concrete actions
	 d.findElement(By.xpath("//input[@name='firstName']")).sendKeys("fname");
	}

	@When("^: we will enter (.*) in middlename field$")
	public void we_will_enter_abd_in_middlename_field(String mname) {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.xpath("//input[contains(@name,'middleName')]")).sendKeys("mname")
	}

	@And("^: we will enter (.*) in lastname field$")
	public void we_will_enter_lastname_in_lastname_field(String lname) {
	    // Write code here that turns the phrase above into concrete actions
		 d.findElement(By.xpath("//input[@name='lastName']")).sendKeys("lname");
	}

	@Then(":user will click on signup button")
	public void user_will_click_on_signup_button() {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    d.quit();
	}



}



