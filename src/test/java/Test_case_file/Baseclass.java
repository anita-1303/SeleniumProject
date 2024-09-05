package Test_case_file;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import Utilities_file.Readconfiguration;

public class Baseclass {
	public static WebDriver driver;
	Readconfiguration rc = new Readconfiguration();
	 String browser = rc.getbrowser();
	 String url = rc.geturl();
	 
	@BeforeTest
	void browserLaunch()
	{
		switch(browser.toLowerCase())
	    { 
		  case "chrome":
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  break;
		
		  case "msedge":
		  driver = new EdgeDriver();
		  driver.manage().window().maximize();
		  break;
		
		  case "firefox":
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  break;
		  default:
			  driver = null;
		      break;
	}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds  (10));
	
	

}
}
