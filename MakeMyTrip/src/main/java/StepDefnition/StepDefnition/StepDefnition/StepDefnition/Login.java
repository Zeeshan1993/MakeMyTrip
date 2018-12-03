package StepDefnition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import RunnerInstance.DriverInstance;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;

public class Login extends DriverInstance

{
	DriverInstance dr=new DriverInstance();
	@Given("^Login url$")
	public void login_url() throws Throwable {
		
		//DriverInstance cr=new DriverInstance();
		WebDriver cr=driver1();
		
	    
	}
	@Then("^verify the home page is displayed$")
	public void verify_the_home_page_is_displayed() throws Throwable {
		
		String tittle=cr.getTitle();
		String actualTitle="MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
		assertEquals(tittle, actualTitle);
	}


	
}
