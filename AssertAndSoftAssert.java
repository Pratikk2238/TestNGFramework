package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertAndSoftAssert {
	@Test
	 public void verifytitleansText() {
		
		 SoftAssert softassert=new SoftAssert();
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.makemytrip.com/");
		 String expectedtext="Hotels";
		 String expectedtitle="MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
		 String actualtext=driver.findElement(By.xpath("//span[@class='chNavText darkGreyText'][normalize-space()='Hotels']")).getText();
		 String actualtitle=driver.getTitle();
		 softassert.assertEquals(actualtitle, expectedtitle, "title verification failed");
		 softassert.assertEquals(actualtext,expectedtext,"text verification faoled");
		 driver.close();
		 softassert.assertAll();
		 
		 //here if we softassert then the script will continue to execute even when any perticullar conditions failed and also report those failures
		 

}
}
