package RunnerInstance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInstance 

{
	public  static ChromeDriver cr;
	
	public  static WebDriver driver1()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	cr = new ChromeDriver();
	//cr.manage().window().maximize();
	 cr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 cr.get("https://www.makemytrip.com");
	 return cr;
	
	}

}
