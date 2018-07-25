package walletHub;

import java.io.FileNotFoundException;
import java.io.IOException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import walletHubPages.ReviewfeedCheck;

public class WalletHubreviewStepDef extends ReviewfeedCheck {

	@Given("^wallet hub url opened$")
	public void Navigatingtoregister() throws FileNotFoundException, IOException {
		try {
			launchbrowser();
		} catch (Exception e) {

		}
	}

	@Then("^enter username and password and click join$")
	public void lightUserCreations() throws InterruptedException {
		try {
			signUp();
			messageverification();
		} catch (Exception e) {
			login();
		}

	}

	@Given("^Navigate to the url provided$")
	public void urlNavigation() throws FileNotFoundException, IOException {
		try {
			openingurl();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^click on the fifth star or write a review link$")
	public void clickontheStartorLink() throws InterruptedException, FileNotFoundException, IOException {
		try {
			Userloginchk();
			clickonFourthStar();
			clickonlink();
		} catch (Exception e) {

		}
	}

	@And("^redirected to the write a review page now click on the policy dropdown to choose value as health$")
	public void policySelection() throws InterruptedException {
		try {
			policyDropSelection();
			clickonFifthStar();
		} catch (Exception e) {

		}
	}

	@And("^click on the review text pane to write review about wallet hub$")
	public void writeReview() throws InterruptedException {
		try {
			writeReviewText();
		} catch (Exception e) {

		}
	}

	@And("^click submit to post the review$")
	public void submit() {
		try {
			submitReview();
		} catch (Exception e) {

		}
	}

	@Then("^verify the confirmation message$")
	public void confirmationMsg() {
		try {
			feedverification2();
		} catch (Exception e) {

		}
	}

	@Then("^navigate to the provided url to check the review feed get posted$")
	public void verifyFeed() {
		try {
			feedconfirmation();
		} catch (Exception e) {

		}
	}

	@Then("^close browser$")
	public void closingbrowser() {
		closeBrowser();
	}

}
