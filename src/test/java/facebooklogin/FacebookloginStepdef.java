package facebooklogin;

import java.io.FileNotFoundException;
import java.io.IOException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import facebookloginPages.Nextpage;

public class FacebookloginStepdef extends Nextpage {

	@Given("^facebook url opened$")
	public void launchlogin() throws FileNotFoundException, IOException {
		launchBrowserr();

	}

	@Then("^enter username and password$")
	public void logintoapplication() {
		try {

			login();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@And("^click logout$")
	public void logoutapp() {
		try {
			 enterStatus();
			logout();
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("^close browser$")
	public void closebrowser() {
		//driver.quit();
	}
}
