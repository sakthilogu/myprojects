package walletHubPages;

import org.openqa.selenium.By;

public class WriteReviewpage extends Userprofileviewpage {

	public WriteReviewpage clickonFifthStar() {
		try{
			if(driver.findElement(By.xpath(prop.getProperty("notification.enabledchk"))).isDisplayed())
			{
			clickByXpath(prop.getProperty("notification.cross"));
			}}
			catch(Exception e)
			{
				
			}
		mousehoverByxpath(prop.getProperty("review.star1"));
		mousehoverByxpath(prop.getProperty("review.star2"));
		mousehoverByxpath(prop.getProperty("review.star3"));
		mousehoverByxpath(prop.getProperty("review.star4" ));
		mousehoverByxpath(prop.getProperty("review.star5" ));
		clickByXpath(prop.getProperty("review.star5"));
		return this;
	}

	public WriteReviewpage policyDropSelection() throws InterruptedException {
		try{
			if(driver.findElement(By.xpath(prop.getProperty("notification.enabledchk"))).isDisplayed())
			{
			clickByXpath(prop.getProperty("notification.cross"));
			}}
			catch(Exception e)
			{
				
			}

		clickbyActions(prop.getProperty("policy.dropdown"));
		clickbyActions(prop.getProperty("policy.value"));
		Thread.sleep(1000);
		return this;
	}

	public WriteReviewpage writeReviewText() throws InterruptedException {
		try{
			if(driver.findElement(By.xpath(prop.getProperty("notification.enabledchk"))).isDisplayed())
			{
			clickByXpath(prop.getProperty("notification.cross"));
			}}
			catch(Exception e)
			{
				
			}
		
		Thread.sleep(1000);
		enterbyXPath(prop.getProperty("review.pane"), prop.getProperty("review.text"));
		clickByXpath(prop.getProperty("review.submit"));
		return this;
	}

	public ReviewfeedCheck submitReview() {
		try{
			if(driver.findElement(By.xpath(prop.getProperty("notification.enabledchk"))).isDisplayed())
			{
			clickByXpath(prop.getProperty("notification.cross"));
			}}
			catch(Exception e)
			{
				
			}
		clickByXpath(prop.getProperty("review.submit"));
		return new ReviewfeedCheck();
	}

}
