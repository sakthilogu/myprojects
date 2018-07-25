package walletHubPages;

import org.openqa.selenium.By;

public class WallethubLoginPage extends GenericFunctions {

	public Welcomepage signUp() {

		enterbyXPath(prop.getProperty("Emailname"), prop.getProperty("email.value"));

		enterbyXPath(prop.getProperty("Password1"), prop.getProperty("pwd.value"));
		enterbyXPath(prop.getProperty("Confirm.password"), prop.getProperty("pwd2.value"));
		clickByXpath(prop.getProperty("check.box.clickxpath"));
		clickByXpath(prop.getProperty("join.button.clickxpath"));

		return new Welcomepage();
	}

	public Welcomepage login() throws InterruptedException {

		if (driver.findElement(By.xpath(prop.getProperty("email.add"))).isEnabled()) {
			enterbyXPath(prop.getProperty("email.add"), prop.getProperty("emailad.value"));
		}
		enterbyXPath(prop.getProperty("password"), prop.getProperty("password.value"));
		Thread.sleep(800);
		clickbyActions(prop.getProperty("login.buttonn"));

		return new Welcomepage();
	}

}
