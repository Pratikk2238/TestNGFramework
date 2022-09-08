package TestNGPractice;

import org.testng.annotations.Test;

public class DataProviderUsingMethodOverloadin {
	
	@Test(dataProvider="create",dataProviderClass=DataProviderByMethodOverloading.class)
	public void test(String uname, String pwd) {
		
		System.out.println(uname+"-----"+pwd);
		
	}
	@Test(dataProvider="create",dataProviderClass=DataProviderByMethodOverloading.class)
public void test1(String uname, String pwd, String third) {
		
		System.out.println(uname+"-----"+pwd+"----"+third);
		
	}
	@Test(dataProvider="create",dataProviderClass=DataProviderByMethodOverloading.class)
public void test2(String uname, String pwd, String third, String fourth) {
	
	System.out.println(uname+"-----"+pwd+"----"+third+"----"+fourth);
	
}


}
