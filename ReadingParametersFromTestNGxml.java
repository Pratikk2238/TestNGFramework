package TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingParametersFromTestNGxml {
//refer testng5 xml here
	public static WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	public void lainchApplication(String browser) {
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 
			
			
			
		}
		else if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
			
		}
		driver.get("https://www.saucedemo.com/");
		
	}
	
	

}
