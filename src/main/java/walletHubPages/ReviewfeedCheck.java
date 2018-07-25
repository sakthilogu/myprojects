package walletHubPages;

import org.openqa.selenium.By;
import org.junit.Assert;

public class ReviewfeedCheck extends WriteReviewpage {

	public ReviewfeedCheck feedconfirmation() {
		String targettext = driver.findElement(By.xpath(prop.getProperty("contentpost.confirm.text"))).getText();
		String actualtext = prop.getProperty("review.confirm.title");
		if (targettext.equalsIgnoreCase(actualtext)) {
			System.out.println("Review posted successfully");
		}
		return this;
	}

	public ReviewfeedCheck feedverification2() {
		String user = prop.getProperty("username");
		driver.navigate().to("https://wallethub.com/profile/" + user + "/reviews/");
		String targettext = driver.findElement(By.xpath(prop.getProperty("reviewlink.text"))).getText();
		String actualtext = prop.getProperty("review.text");
		Assert.assertTrue(targettext.equalsIgnoreCase(actualtext));
		return new ReviewfeedCheck();
	}
	

}//*[@id="js_5i"]/div[1]/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div
