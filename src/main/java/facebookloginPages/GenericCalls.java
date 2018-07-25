package facebookloginPages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class GenericCalls {
	
	Properties prop = new Properties();
	protected static WebDriver driver;

	public void loadObjects() throws FileNotFoundException, IOException {

		prop = new Properties();
		prop.load(new FileInputStream(new File("./object.properties")));

	}

	public void launchBrowserr() throws FileNotFoundException, IOException {

		loadObjects();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void enterbyXPath(String XPath, String textToEnter) {
		try {
			driver.findElement(By.xpath(XPath)).sendKeys(textToEnter);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void alerthandlingdismiss() {
		Alert alert = driver.switchTo().alert();

		try {
			alert.dismiss();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickbyActions(String Xpath) {
		Actions actions = new Actions(driver);
		WebElement settings = driver.findElement(By.xpath(Xpath));
		actions.moveToElement(settings).click().build().perform();
		

	}

	public boolean clickByXpath(String xpathVal) {
		boolean bReturn = false;
		try {
			driver.findElement(By.xpath(xpathVal)).click();

			bReturn = true;

		} catch (Exception e) {

		}
		return bReturn;
	}

}
