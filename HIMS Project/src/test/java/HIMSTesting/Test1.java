package HIMSTesting;


import java.util.concurrent.TimeUnit;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Browser.Login;
import Module.NetworkMemTypeProfile;
import Module.Aliment2;


public class Test1 extends Login{
	
	NetworkMemTypeProfile peg1;
	Aliment2 peg2;
	
	@BeforeMethod
	public void setup() throws Exception 
	{
		
		initilizationB();		
		peg1=new NetworkMemTypeProfile();
		peg2=new Aliment2();
		peg1.VerifyAppLogIn();
		
		peg1.verifyHIMSBtn();
		Thread.sleep(2000);
		peg1.verifynetDevBtn();
		Thread.sleep(2000);
		peg1.verifyprofile();
		Thread.sleep(2000);
		peg2.verifyNewBtn();
		
		
		/*peg2.verifySearchBtn1();
		Thread.sleep(2000);
		peg2.verifySearchBtn2();      //This is for Edit option
		Thread.sleep(2000);
		peg2.verifyEdit();
		Thread.sleep(2000);*/
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	}
	
	@Test(priority=1,enabled=true)
	public void nameTest() throws Exception
	{
		peg2.verifyName();
	}
	
	@Test(priority=2,enabled=true)
	public void shortNemeTest() throws Exception
	{
		peg2.verifyShortName();
	}
	
	@Test(priority=3,enabled=true)
	public void netTypeTest() throws Exception
	{
		peg2.verifyNetType();
	}
	
	@Test(priority=4,enabled=true)
	public void remarkTest() throws Exception
	{
		peg2.verifyRemark();
	}
	
	@Test(priority=5,enabled=true)
	public void saveBtnTest() throws Exception
	{
		peg2.verifySaveBtn();
	}
	
	

	
	
//This is for Edit option
	
	/*@Test(enabled=true)
	public void searchBtnTest1() throws Exception
	{
		peg2.verifySearchBtn1();
	}
	@Test(enabled=true)
	public void searchBtnTest2() throws Exception
	{
		peg2.verifySearchBtn2();
	}
	@Test(enabled=true)
	public void editTest()
	{
		peg2.verifyEdit();
	}
	@Test(enabled=true)
	public void shortNameTest() throws Exception
	{
		peg2.verifyShortName2();
	}

	@Test(enabled=true)
	public void saveBtnTest2() throws Exception
	{
		peg2.verifySaveBtn2();
	}*/
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}
	
	
	/*public void exit(ITestResult a) throws Throwable
	{
      if(ITestResult.FAILURE==a.getStatus())
      {
    	  captureScreenshotFaildTC(a.getName());
    	 
      }
      driver.close();
	}
	*/
}
