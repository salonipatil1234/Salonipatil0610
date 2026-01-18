package bdd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signupformscript {
	WebDriver d;
	String url= "https://www.facebook.com/r.php?entry_point=login";
	

	
	
	
	
	
	@Given("user is on signup page")
	public void user_is_on_signup_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		d= new ChromeDriver();
	    d.get(url);
	    Thread.sleep(2000);
	}

	@When("user will enter firstname in firstname field")
	public void user_will_enter_firstname_in_firstname_field() {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.xpath("//input[@name='firstname']")).sendKeys("navya");
	}

	@And("user will enter lastname in lastname field")
	public void user_will_enter_lastname_in_lastname_field() {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.xpath("//input[@name='lastname']")).sendKeys("koli");
	}

	@When("user will select DOB field")
	public void user_will_select_dob_field() throws InterruptedException {
		
		new Select  (d.findElement(By.xpath("//select[@title='Day']"))).selectByVisibleText("13");
		Thread.sleep(2000);
		new Select (d.findElement(By.xpath("//select[@name='birthday_month']"))).selectByVisibleText("Feb");
		Thread.sleep(2000);
		new Select (d.findElement(By.xpath("//select[@name='birthday_year']"))).selectByVisibleText("2020");
		Thread.sleep(2000);
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@And("user will select gender field")
	public void user_will_select_gender_field() {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.xpath("//label[contains(.,'Female')]")).click();
	    
	}

	@When("user will enter emailid in emailid field")
	public void user_will_enter_emailid_in_emailid_field() {
	    // Write code here that turns the phrase above into concrete actions
	   d.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("xyz@gmail.com");
	   
	}

	@And("user will enter new pass in pass field")
	public void user_will_enter_new_pass_in_pass_field() {
	    // Write code here that turns the phrase above into concrete actions
	   d.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("123456");
	}

	@Then("user will click on signup button")
	public void user_will_click_on_signup_button() {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.xpath("//button[@name='websubmit']")).click();
	}


}
