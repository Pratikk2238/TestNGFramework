package TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

import CommonDataSetup.BaseTestScreenShot;

public class ListenerDemoScreenShotTest extends BaseTestScreenShot{
@Test
	 public void launchAPP() {
		 
		 driver.get("https://google.com");
		 Assert.assertTrue(false);
	 }
}
