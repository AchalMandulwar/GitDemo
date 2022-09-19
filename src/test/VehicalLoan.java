package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VehicalLoan {
	
	
	@AfterMethod
	public void AM()
	{
		System.out.println("I will execute at last After eacha and every method excuted from this VehicalLoan Class");
	}
	//@Parameters({"URL"})
	@Test
	public void CarLoan()
	{
		System.out.println("CarLoan");
		//System.out.println(uname);
	}
	
	@Test
	public void BikeLoan()
	{
		System.out.println("BikeLoan");
	}
	
	@Test(groups= {"Smoke"})
	public void MopedLoan()
	{
		System.out.println("MopedLoan");
		
	}
	
	@Test
	public void MobileLogin()
	{
		System.out.println("MobileLogin");
		
	}
	
	@Test
	public void MobileSignIn()
	{
		System.out.println("MobileSignIn");
		
	}
	
	@BeforeMethod
	public void BM()
	{
		System.out.println("I will execute first before any method excuted from VehicalLoan Class");
	}

	@Test
	public void MobileSignOut()
	{
		System.out.println("MobileSignOut");
		
	}
}
