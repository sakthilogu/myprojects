package facebookloginPages;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Nextpage extends LoginPage {

	public Nextpage enterStatus() throws FileNotFoundException, IOException, InterruptedException {
		loadObjects();
		
		clickByXpath(prop.getProperty("home.click"));
		Thread.sleep(500);
		
		//clickbyActions(prop.getProperty("copmpost.xpath"));
		
		
		clickbyActions(prop.getProperty("status.xpath"));
		enterbyXPath(prop.getProperty("status.xpath"), prop.getProperty("status.value"));
		clickbyActions(prop.getProperty("clickon.post"));
		Thread.sleep(500);
		return new Nextpage();
	}

	public LoginPage logout() throws FileNotFoundException, IOException {
		loadObjects();
		clickbyActions(prop.getProperty("clickon.dropdown"));

		clickbyActions(prop.getProperty("clickon.logout"));
		return new LoginPage();
	}
}
