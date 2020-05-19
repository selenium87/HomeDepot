package Execution;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import screens.Data;

public class Startup {
	public static WebDriver driver;
	Properties pro = new Properties();
	Data da = new Data();

	@BeforeClass
	@Parameters("browser")
	public void beforeClass(String brows) throws IOException {
	if(brows.contentEquals("chrome")) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		pro.load(da.datas());
		driver.navigate().to(pro.getProperty("URL"));

		driver.manage().window().maximize();

	}

	else {
		System.out.println("choose a driver please");
	}
}
	public void screenshot(String result) throws IOException {
File take = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(take,new File("C:\\Users\\husky\\Desktop\\screens" +result+phototime()+".jpg"));
	}

	public  String phototime() {
		return new SimpleDateFormat("yy-MM-dd-HH-dd-ss").format(new Date());
	

	} 

	@AfterClass
	public void afterClass() throws IOException {

	
		
	
		
	

	
		
		
			
		
		
		
		
	}

}
