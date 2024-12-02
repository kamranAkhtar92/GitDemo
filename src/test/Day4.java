package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	@Test@Parameters({"URL"})
	public void webloginhomeLoan()
	{
		//selenium
		System.out.println("webloginhome");
		System.out.println("uname");
	}
	@Test(groups= {"smoke"})
	public void MobielloginHomeloan()
	{
		//Appium
		System.out.println("MobileLoginhome");
	}
	@Test
	public void LoginApiHomeLoan()
	{
		//Rest Api automation
		System.out.println("ApiLoginhome");
	}

}
