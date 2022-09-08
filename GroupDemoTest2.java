package TestNGPractice;
import CommonDataSetup.CommonData;

import org.testng.annotations.Test;

import CommonDataSetup.CommonData;
//we can group the test cases at themethod level and at class level
@Test(groups="user registrstion functionality")
public class GroupDemoTest2 extends CommonData{
	
	
	@Test(priority=1,groups="regression")
	public void atest1() {
		
		System.out.println("test1");
		
		}
	
	@Test(priority=2,groups="regression")
	public void atest2() {
		
		System.out.println("test2");
		
	}

	@Test(groups={"regression","bvt"})
	public void atest3() {
	System.out.println("test3");
	
	
}

	@Test(groups="bvt")

	public void atest4() {
	
	System.out.println("test4");
	
	
}

}
