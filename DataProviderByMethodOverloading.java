package TestNGPractice;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderByMethodOverloading {
	
@DataProvider(name="create")
	public Object[][] dataset(Method m){
		
		Object[][] testdata=null;
		if(m.getName().endsWith("test")) {
			
			testdata=new Object[][] {
				{"user","pward"},
				{"user1","pward1"},
				{"user2","pward2"},
				{"user3","pward3"},
							
			};
		}
			else if(m.getName().equals("test1")) {
				
				testdata=new Object[][] {
					{"user","pward","3rd"},
					{"user1","pward1","3rd"},
					{"user2","pward2","3rd"},
					{"user3","pward3","3rd"},
								
				};
			}
				else if(m.getName().equals("test2")) {
					
					testdata=new Object[][] {
						{"user","pward","3rd","4th"},
						{"user1","pward1","3rd","4th"},
						{"user2","pward2","3rd","4th"},
						{"user3","pward3","3rd","4th"},
									
					};
				}
		return testdata;
					
			}
				
			
		}
		
		
	

