package Execution;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import mainPage.homepage;
import mainPage.registration;

@Listeners(listnersss.class)
public class Execution extends Startup {
	// WebDriver driveer;
//	private static Logger log = LogManager.getLogger(Execution.class.getName());
	static private Logger log = LogManager.getLogger(Execution.class.getName());
	@Test(priority = 0)
	
	public void one() throws InterruptedException, IOException {

		homepage hom = new homepage(driver);
		hom.accnt();
		log.info("account button clicked");
		hom.registers();
		log.info(" register button clicked");
		
	}

	@Test(priority = 1)

	@Parameters({ "emx", "psx", "zcx", "phx" })

	public void two(String em, String ps, String zc, String ph ) {

		registration re = new registration(driver);
		re.emails(em);
		log.info("email was written");
		re.pass(ps);
		log.info("password was written");
		re.zipcode(zc);
		log.info("zipcode was written");
		re.phone(ph);
		log.info("phone number was written");
		re.create();
		log.info("create button was clicked");

	}
}
