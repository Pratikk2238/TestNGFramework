package TestNGPractice;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipRestCase {
	
	Boolean datasetup=false;
	

	@Test(enabled = false) // used to skip the tc 1st way this test case is not available for execution
	public void skipTest1() {

		System.out.println("skipping the test case as its not complete");
	}
	@Test
	public void skipTest2() {

		System.out.println("skipping the test case forcefully");
		throw new SkipException("Skipping this test"); // second way
	}
	@Test
	public void skipTest3() {
		
		
		System.out.println("skipping the test case bsed on condition");
		if(datasetup==true)
		{
			System.out.println("execute the test");
			
		}
		else
		{
			System.out.println("do not execute the test");
			throw new SkipException("do not execute further steps");
			
			
		}
	}
	

}
