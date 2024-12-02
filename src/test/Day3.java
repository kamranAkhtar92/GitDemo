package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before executing any methods in the class");
	}
	@Parameters({"URL,APIKeys/username"})
	@Test
	public void webloginCarLoan(String urlname,String key)
	{
		//selenium
		System.out.println("webloginCar");
		System.out.println(urlname);
		System.out.println(key);
	}
	@BeforeMethod
	public void beforevery()
	{
		System.out.println("I will execute before every test method in day 3 class");
	}
	@AfterMethod
	public void aftervery()
	{
		System.out.println("I will execute after every test method in day 3 class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After executing all the  methods in the class");
	}
	@Test(groups= {"smoke"})
	public void MobileloginLoan()
	{
		//Appium
		System.out.println("MobileLoginCar");
	}
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("i am no one");
	}
	@Test(enabled=false)//this is use to when test casew is failed skip the test case
	public void MobilesigncarLoan()
	{
		//Appium
		System.out.println("Mobile");
	}
	@Test(dataProvider="getData")
	public void MobilelogoutcarLoan(String username,String password)
	{
		//Appium
		System.out.println("Mobile signout");
		System.out.println(username);
		System.out.println(password);
	}
	@Test(dependsOnMethods= {"webloginCarLoan","MobilelogoutcarLoan"})
	public void ApiCarLoan()
	{
		//Rest Api automation
		System.out.println("ApiLoginCar");
	}
	@DataProvider
	public Object[][] getData()
	{
		//1st combination-username password -good credit history
		//2nd -username password -no credit history
		//3rd-fraudelent credit history
		Object[][] data=new Object[3][2];
		//1st set
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		//columns in the row are nothing but values for that particular combination(row)
		
		//2nd set
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
		
		
		
		
		
		
	}

}
