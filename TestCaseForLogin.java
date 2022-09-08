package TestNGPractice;

import org.testng.annotations.Test;

public class TestCaseForLogin {
	
	
	@Test(priority=1,description="this is login test")
	public  void  loginTest() {
		
		System.out.println("login is successful");
		
	}
	
	@Test(priority=2,description="this is logout test")
	public void logoutTest() {
		
		System.out.println("logout is successful");
	}
	
	

}
