package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeLoan {
	
	
	@BeforeSuite
	public void BS()
	{
		System.out.println("I will execute Before any method executed from this suite");
	}
	
	@Parameters({"URL"})
	@Test
	public void HomeLogin(String urlname)
	{
		System.out.println("HomeLogin TC");
		System.out.println(urlname);
	}
	
	@AfterClass
	public void AC()
	{
		System.out.println("I will execute at last once all the method excuted from HomeLoan");
	}
	
	@Test(groups= {"Smoke"})
	public void PlotLoan()
	{
		System.out.println("This is Plot Loan Test Case");
	}
	
	
	@AfterTest
	public void AT()
	{
		System.out.println("I wwill excute at Last after all the Test Cases excuted from this test");
	}
	
	@Test
	public void FlatLoan()
	{
		System.out.println("This is Flat Loan Test Case");
	}

	
	@Test(enabled=false)
	public void DuplexLoan()
	{
		System.out.println("This is Duplex Loan Test Case");
	}
	
	@BeforeClass
	public void BC()
	{
		System.out.println("I will execute at First before all the method excuted from HomeLoan Class");
	}


}
