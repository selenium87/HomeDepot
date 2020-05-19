package mainPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

	@FindBy(xpath = "//*[@id=\"headerMyAccount\"]")
	WebElement account;

	@FindBy(id = "SPSORegister")
	WebElement regeister;

	public homepage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void accnt() {
		account.click();
	}

	public void registers() throws InterruptedException {
		Thread.sleep(4000);

		regeister.click();
		

	}
}
