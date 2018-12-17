package StepDefnition;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import RunnerInstance.DriverInstance;
import cucumber.api.java.en.Then;

public class SearchHomeStays extends DriverInstance
{
	DriverInstance dr=new DriverInstance();
	
	
	@Then("^Click on the HomeStyas button$")
	public void click_on_the_HomeStyas_button() throws Throwable {
		
		Actions mouse=new Actions(dr.cr);
		mouse.moveToElement(dr.cr.findElementById("header_tab_homestays")).click().perform();    
	}

	@Then("^Enter Destination place as \"([^\"]*)\"$")
	public void enter_Destination_place_as(String dest) throws Throwable {
	    dr.cr.findElementById("hp-widget__sDest").clear();
	    dr.cr.findElementById("hp-widget__sDest").sendKeys(dest);
	    Thread.sleep(2000);
	}

	@Then("^Enter Checkin date as \"([^\"]*)\" and Chekout date as \"([^\"]*)\"$")
	public void enter_Checkin_date_as_and_Chekout_date_as(String CheckIn, String CheckOut) throws Throwable {
	   dr.cr.findElementById("hp-widget__chkIn").click();
	   dr.cr.findElementByCssSelector(".dateFilter.hasDatepicker>div>div:nth-child(2)>table>tbody>tr:nth-child(5)>td:nth-child(1)>a").click();
	   System.out.println(CheckIn + "is the CheckIn date");
	  
	   dr.cr.findElementById("hp-widget__chkOut").click();
	dr.cr.findElementByCssSelector(".dateFilterReturn.hasDatepicker>div>div:nth-child(2)>table>tbody>tr:nth-child(5)>td:nth-child(4)>a").click();
	   System.out.println(CheckOut + "is the CheckOut date");
	}

	@Then("^Enter the no of Guest as \"([^\"]*)\"$")
	public void enter_the_no_of_Guest_as(String arg1) throws Throwable {
		dr.cr.findElementById("hp-widget__paxCounter").click();
		Thread.sleep(2000);
		dr.cr.findElementByCssSelector(".paxFilter>div>div>div>div>div:nth-child(2)>ul>li:nth-child(3)").click();
		System.out.println(arg1 + " Guests are selected");
		//dr.cr.findElementByCssSelector("#js-adult_counter>li:nth-child(3)").click();
	    
	}

	@Then("^Click on the Search button$")
	public void click_on_the_Search_button() throws Throwable {
	    dr.cr.findElementByCssSelector("#searchBtn").click();
	    Thread.sleep(3000);
	    //String Window=dr.cr.getWindowHandle();
	    //System.out.println(Window);
	   //dr.cr.switchTo().window("CDwindow").close();
	    //dr.cr.switchTo().frame(dr.cr.findElementByCssSelector("#root>div>div:nth-child(2)>div:nth-child(4)>span")).close();
	    
	}
	@Then("^close the pop up$")
	public void close_the_pop_up() throws Throwable {
		dr.cr.findElementByXPath("//div[@class='mmWrap']/span").click();
	    System.out.println("Aleart is closed");
	}

	@Then("^verify that list of hotels are displayed$")
	public void verify_that_list_of_hotels_are_displayed() throws Throwable {
	    @SuppressWarnings("unchecked")
		List <WebElement> list=(List<WebElement>) dr.cr.findElementsByXPath("//div[@class='listingRowOuter']");
	    int NoOfHotels=list.size();
		System.out.println("No of hotels are " + NoOfHotels);

	}
}
