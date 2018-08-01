package authenticate;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




public class Authentic   {
	protected static RemoteWebDriver driver;
	
	Reporter re=new Reporter();
	
	@BeforeSuite
	public void beforeSuite() throws FileNotFoundException, IOException{
		re.startResult();
	
	}

	@Test
	public void launchBrowserr() throws FileNotFoundException, IOException {
try
{
		re.startTestCase();
		//loadObjects();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver =  new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		re.reportStep(driver,"end of test", "PASS");
		
}
catch(Exception e)
{
	System.out.println(e);
}
		
	}
	
	@AfterTest
	public void logout()
	{		
	driver.quit();	
	
	
	}
	
	@AfterSuite
	public void afterSuite() throws FileNotFoundException, IOException{
		re.endResult();
	
	}
	
	
}
