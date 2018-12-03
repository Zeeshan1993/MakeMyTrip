package StepDefnition;

import org.openqa.selenium.interactions.Actions;

import RunnerInstance.DriverInstance;
import cucumber.api.java.en.Then;

public class SeaechHotels extends DriverInstance
{
	DriverInstance dr=new DriverInstance();
	
	@Then("^click on Hotels link$")
	public void click_on_Hotels_link() throws Throwable {
	    Actions mouse=new Actions(dr.cr);
	    mouse.moveToElement(dr.cr.findElementById("#header_tab_hotels")).click().perform();
		//dr.cr.findElementById("#header_tab_hotels").click();
	    System.out.println("Hotels menu is selected");
	}

	@Then("^Veify that Hotels page is displayed$")
	public void veify_that_Hotels_page_is_displayed() throws Throwable {
	    String HotelsTitle=dr.cr.getTitle();
	    System.out.println(HotelsTitle);
	}

	@Then("^Enter City, Hotel or Area as \\\"([^\\\"]*)\\\"$")
	public void enter_City_Hotel_or_Area(String Hotel) throws Throwable {
	    dr.cr.findElementById("#hp-widget__sDest").clear();
	    dr.cr.findElementById("#hp-widget__sDest").sendKeys(Hotel);
	    System.out.println(Hotel + "is entered");
	}

	@Then("^Enter Checkin as \"([^\"]*)\" and Chekout as \"([^\"]*)\"$")
	public void enter_Checkin_as_and_Chekout_as(String Checkin, String Checkot) throws Throwable {
		dr.cr.findElementById("hp-widget__chkIn").click();
		Thread.sleep(1000);
	dr.cr.findElementByCssSelector(".dateFilter.hasDatepicker>div>div:nth-child(2)>table>tbody>tr:nth-child(6)>td>a").click();
	System.out.println(Checkin + "is the Checkin date");
	Thread.sleep(1000);
	
	dr.cr.findElementById("hp-widget__chkOut").click();
	Thread.sleep(1000);
dr.cr.findElementByCssSelector(".dateFilterReturn.hasDatepicker>div>div:nth-child(2)>div>a").click();
System.out.println("Navigation button is clicked");
dr.cr.findElementByCssSelector(".dateFilterReturn.hasDatepicker>div>div>table>tbody>tr:nth-child(2)>td>a").click();
System.out.println(Checkot + "is the Checkot date");
Thread.sleep(1000);
	}

	@Then("^Enter no\\.of Rooms as \"([^\"]*)\" and no\\.of Guests as \"([^\"]*)\"$")
	public void enter_no_of_Rooms_as_and_no_of_Guests_as(String arg1, String arg2) throws Throwable {
	    
	}

	@Then("^verify that list of Hotels are displayed$")
	public void verify_that_list_of_Hotels_are_displayed() throws Throwable {
	    
	}
}
