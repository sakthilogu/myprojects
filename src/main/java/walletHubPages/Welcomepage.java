package walletHubPages;

import org.openqa.selenium.By;

public class Welcomepage extends WallethubLoginPage {

	public Userprofileviewpage messageverification() {
		if (driver.findElement(By.xpath(prop.getProperty("message.xpath"))).equals(prop.getProperty("message.value")))

		{
			System.out.println("light user creation completed");
		}
		
		return new Userprofileviewpage();
	}
}
