package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

//here we are going to use the data provider class attribute to move the data
//here data will be present in different class then the actual script
public class DataProviderMoveDemo {

	@Test(dataProvider = "create", dataProviderClass = MoveDataFromDataProvider.class)
	public void test(String uname, String pword) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pword);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.close();
	}

}
