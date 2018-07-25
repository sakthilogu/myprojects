package facebookloginPages;

public class LoginPage extends GenericCalls {

	public Nextpage login() {
		
		enterbyXPath(prop.getProperty("fEmailname"), prop.getProperty("femail.value"));
		enterbyXPath(prop.getProperty("fPassword1"), prop.getProperty("fpwd.value"));
		clickByXpath(prop.getProperty("fjoin.button.clickxpath"));
		return new Nextpage();
	}

}
