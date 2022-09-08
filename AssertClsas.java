package TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertClsas {
	
	@Test
	
 public void verifytitle() {
	 
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver= new ChromeDriver();
	 driver.get("https://www.makemytrip.com/");
	 String actualtitle=driver.getTitle();
	 String expectedtitle="MakeMyTrip - #1 Travel1 Website 50% OFF on Hotels, Flights & Holiday";
	 
	 Assert.assertEquals(actualtitle, expectedtitle);//if there are multiple tests and if this assert fails then the test case execution will stop here
	 
 }	
	

}
