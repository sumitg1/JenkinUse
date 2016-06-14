package test;
import DriverUtilities.WebDriverConfigure;

public class test extends WebDriverConfigure {
	public boolean AssertTrueMethod(String s){
		 if(driver.getTitle().contains(s))
			 return true;
		 else
		return false;
		
	}

}
