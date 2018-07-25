package walletHubPages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class GenericFunctions {

	
	
	Properties prop = new Properties();
	protected static WebDriver driver;

	public void loadObjects() throws FileNotFoundException, IOException {

		prop = new Properties();
		prop.load(new FileInputStream(new File("./object.properties")));

	}

	public void launchbrowser() throws FileNotFoundException, IOException {
		loadObjects();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://wallethub.com/join/light");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public void enterbyXPath(String XPath, String textToEnter) {
		try {
			driver.findElement(By.xpath(XPath)).clear();
			driver.findElement(By.xpath(XPath)).sendKeys(textToEnter);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void closeBrowser()
	{
		driver.quit();
	}
	public void clickbyActions(String Xpath) {
		Actions actions = new Actions(driver);
		WebElement settings = driver.findElement(By.xpath(Xpath));
		actions.moveToElement(settings).click().build().perform();
		//settings.click();

	}

	public void mousehoverByxpath(String Xpath) {
		Actions actions = new Actions(driver);
		WebElement settings = driver.findElement(By.xpath(Xpath));
		actions.moveToElement(settings).build().perform();

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
