package mainPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registration {

	

	@FindBy(xpath="//input[@id='email']")
	WebElement email;

	@FindBy(id = "password-input-field")
	WebElement password;

	@FindBy(id = "zipCode")
	WebElement zip;

	@FindBy(id = "phone")
	WebElement phonee;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement creat;


	public registration(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public void emails(String em)  {

		email.sendKeys(em);
	}

	public void pass(String ps) {
		password.sendKeys(ps);
	}

	public void zipcode(String zc) {
		zip.sendKeys(zc);
	}

	public void phone(String ph) {
		phonee.sendKeys(ph);
	}
	public void create() {
		creat.click();
	}
	
}
