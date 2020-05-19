package screens;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Data{

	 
		public FileInputStream datas() throws IOException {
			
			FileInputStream fi = new FileInputStream("C:\\Users\\husky\\eclipse-workspace\\HomeDepot.com\\src\\main\\java\\screens\\data.properties");
			
	return fi;
	
	
	
	
	
	
		}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

