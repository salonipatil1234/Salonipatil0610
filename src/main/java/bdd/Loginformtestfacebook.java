package bdd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginformtestfacebook {
	
	WebDriver d;
	String url= "https://www.facebook.com/";
	
	
	@Given("user is on login page of facebook")
	public void user_is_on_login_page_of_facebook() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		d= new  ChromeDriver();
		d.get(url);
		Thread.sleep(2000);
	   
	}

	@When("user will enter username in username field")
	public void user_will_enter_username_in_username_field() {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.xpath("//input[@name='email']")).sendKeys("xyz@gmail.com");
	   
	}

	@And("user will enter password in possword feild")
	public void user_will_enter_password_in_possword_feild() {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.xpath("//input[@name='pass']")).sendKeys("xyz123456");
	    
	}

	@Then("user will click on login button")
	public void user_will_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.xpath("//button[@type='submit']")).click();
	    
	}


}







bdd = behaviour driven 
