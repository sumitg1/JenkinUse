package test;
import DriverUtilities.WebDriverConfigure;

public class test extends WebDriverConfigure {
	public boolean AssertTrueMethod(String s){
		System.out.println(s);
		 if(driver.getTitle().contains(s))
			 return true;
		 else
		return false;
		
	}

}
