package StepDefnition;

import java.io.File;

import javax.imageio.stream.FileImageOutputStream;
import javax.swing.plaf.FileChooserUI;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import RunnerInstance.DriverInstance;

import cucumber.api.java.en.Then;

public class SearchFlight extends DriverInstance

{
	DriverInstance dr=new DriverInstance();
	int adults=0;
	int Chilrens=0;
	int Infants=0;
	@Then("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String from, String to) throws Throwable {
	    dr.cr.findElementById("hp-widget__sfrom").clear();
	    dr.cr.findElementById("hp-widget__sfrom").sendKeys(from);
	    //dr.cr.findElementById("ui-id-1")
	    Thread.sleep(1000);
	    //dr.cr.findElementById("hp-widget__sfrom").sendKeys(Keys.TAB);
	    System.out.println(from + "is selected");
	    dr.cr.findElementById("hp-widget__sTo").clear();
	    dr.cr.findElementById("hp-widget__sTo").sendKeys(to);
	    //dr.cr.findElementById("hp-widget__sTo").sendKeys(Keys.TAB);
	    System.out.println(to + "is selected");
	}

	@Then("^Enter the Depart date as \"([^\"]*)\"$")
	public void enter_the_Depart_date_as(String arg1) throws Throwable {
		dr.cr.findElementById("hp-widget__depart").click();
		Thread.sleep(1000);
	dr.cr.findElementByCssSelector(".dateFilter.hasDatepicker>div>div>table>tbody>tr:nth-child(6)>td>a").click();
	System.out.println("Depart date is selected");
	}

	@Then("^Enter the number of \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_number_of_and_and(int adults, int Chilrens, int Infants) throws Throwable {
		System.out.println(adults);
		 dr.cr.findElementById("hp-widget__paxCounter_pot").click();
		    System.out.println("Enter the number of passangers");
		    Thread.sleep(2000);
		for(int i=0;i>=adults;i++)
		{
			dr.cr.findElementByCssSelector(".adult_counter>li:nth-child(2)").click();
			System.out.println(adults + "adults are selected");
		}
		Thread.sleep(2000);
		for(int j=0;j>=Chilrens;j++)
		{
			dr.cr.findElementByCssSelector(".child_counter>li:nth-child(j)").click();
			System.out.println(Chilrens + "Chilrens are selected");
		}
		Thread.sleep(2000);
		for(int k=0;k>=Infants;k++)
		{
			dr.cr.findElementByCssSelector(".infant_counter>li:nth-child(k)").click();
			System.out.println(Infants + "Infants are selected");
		}
	   
	    
	}
	@Then("^Select the class as \"([^\"]*)\"$")
	public void select_the_class_as(String arg1) throws Throwable {
	    if(arg1.equals("Business"))
	    		{
	    	dr.cr.findElementByCssSelector("#business").click();
		    System.out.println("Business class is selected");
	    		}
	    dr.cr.findElementByLinkText("Done").click();
		
	}
	@Then("^Click on Search button$")
	public void click_on_Search_button() throws Throwable {
		dr.cr.findElementById("searchBtn").click();
		System.out.println("Search button is clicked");
	}
	
	@Then("^verify that list of flights are displayed$")
	public void verify_that_list_of_flights_are_displayed() throws Throwable {
	    TakesScreenshot scrShot=((TakesScreenshot)dr.cr);
	    File srcFile=scrShot.getScreenshotAs(OutputType.FILE);
	    File dstFile=new File("C:\\Users\\E004194\\Downloads\\soft");
	   
	    FileUtils.copyFileToDirectory(srcFile, dstFile);
	  
	}
	
}
