package walletHubPages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;

public class Userprofileviewpage extends Welcomepage {
	public Userprofileviewpage openingurl() throws FileNotFoundException, IOException  {
		loadObjects();
		driver.navigate().to("https://wallethub.com/profile/test_insurance_company/");
		//Thread.sleep(800);
		
		
		return this;
	}
	
	public Userprofileviewpage Userloginchk() throws FileNotFoundException, IOException, InterruptedException {
		
		try {
			if (driver.findElement(By.xpath(prop.getProperty("notification.enabledchk"))).isDisplayed()) {
				clickByXpath(prop.getProperty("notification.cross"));
			}
		} catch (Exception e) {

		}
		
		clickbyActions(prop.getProperty("loginbut.xpath"));
		Thread.sleep(800);
		enterbyXPath(prop.getProperty("email.add"), prop.getProperty("email.value"));
		enterbyXPath(prop.getProperty("password"), prop.getProperty("pwd.value"));
		clickByXpath(prop.getProperty("login.button3"));
		
		//String profile_user=driver.findElement(By.xpath(prop.getProperty("username.xpath"))).getText();
		//String actual_user=prop.getProperty("username");
//		if(profile_user.equalsIgnoreCase(actual_user))
//		{
//			System.out.println(profile_user +"Logged in successfully");
//		}
//		else
//		{
//			System.out.println(profile_user +"failed to login");
//		}
		
		
		
		return this;
	}
	public WriteReviewpage clickonFourthStar() throws FileNotFoundException, IOException, InterruptedException {
		

		try {
			if (driver.findElement(By.xpath(prop.getProperty("notification.enabledchk"))).isDisplayed()) {
				clickByXpath(prop.getProperty("notification.cross"));
			}
		} catch (Exception e) {

		}
		mousehoverByxpath(prop.getProperty("enable.review"));
		mousehoverByxpath(prop.getProperty("star1.xpath"));
		 mousehoverByxpath(prop.getProperty("star2.xpath"));
		mousehoverByxpath(prop.getProperty("star3.xpath"));
		mousehoverByxpath(prop.getProperty("star4.xpath"));
		mousehoverByxpath(prop.getProperty("star5.xpath"));
		clickbyActions(prop.getProperty("star5.xpath"));

		
		return new WriteReviewpage();
	}

	public WriteReviewpage clickonlink() {
		driver.navigate().back();
		clickByXpath(prop.getProperty("review.button"));

		return new WriteReviewpage();
	}
}
