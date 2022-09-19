package test;

import org.testng.annotations.AfterSuite;
//import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoldLoan {
	
	@BeforeTest
	public void BT()
	{
		System.out.println("I will execute First before any Test Case excutes from this test ");
	}
	
	@Test(groups= {"Smoke"})
	public void ManOrnamentLoan()
	{
		System.out.println("This is the ManOrnamentLoan Test Case");
		
	
	}
	
	
	@Test(dataProvider = "getdata")
	public void GoldLogin(String Username , String Password)
	{
		System.out.println("I will execute for Gold Login");
		
		System.out.println(Username);
		
		System.out.println(Password);
	}
	
	
	@DataProvider
	@Test
	public Object[][] getdata()
	{
		Object[][] data = new Object[3][2];
		data[0][0]="FirstUsername";
		data[0][1]="FirstPassword";
		
		data[1][0]="SecondUsername";
		data[1][1]="SecondPassword";
		
		data[2][0]="ThirdUsername";
		data[2][1]="ThirdPassword";
		
		return data;
	}
	
	
	@Test
	public void WomenOrnamentLoan()
	{
		System.out.println("This is the WomenOrnamentLoan Test Case");
	}
	
	@Test(dependsOnMethods= {"GoldLogin"})
	public void ChildOrnamentLoan()
	{
		System.out.println("This is the ChildOrnamentLoan Test Case");
		
	}
	
	@AfterSuite
	public void AS()
	{
		System.out.println("I will execute at Last once all the method executed from this Suite");
	}

}
