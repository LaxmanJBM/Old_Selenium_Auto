package HIMSTesting;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Browser.Login;
import Module.NetworkMemTypeProfile;
import Module.NetworkMemberProfile;

public class NMProfileTest extends Login{
	
	
	NetworkMemberProfile nmp;
	NetworkMemTypeProfile nmtp;   //This is the Network member Type Profile Screen
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initilizationB();
		nmp=new NetworkMemberProfile();		
		nmtp.VerifyAppLogIn();
		Thread.sleep(2000);
		nmtp.verifyHIMSBtn();
		Thread.sleep(2000);
		nmtp.verifynetDevBtn();
		Thread.sleep(2000);
		nmp.verifyNetMemPro();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	}
	@Test(priority=1,enabled=true)
	public void newBtnTest()
	{
		nmp.verifynewBtn();
	}
	@Test(priority=2,enabled=true)
	public void ProviderConTest() throws Exception
	{
		nmp.verifyProviderCon();
	}
	@Test(priority=3,enabled=true)
	public void NetMemGroupTypeTest() throws Exception
	{
		nmp.verifyNMGroupTy();
	}
	@Test(priority=4,enabled=true)
	public void networkEntTest()
	{
		nmp.verifynetworkEnt();
	}
	@Test(priority=5,enabled=true)
	public void currencyTest() throws Exception
	{
		nmp.verifycurrency();
	}
	@Test(priority=6,enabled=true)
	public void nameTest()
	{
		nmp.verifyname();
	}
	@Test(priority=7,enabled=true)
	public void codeTest()
	{
		nmp.vrfycode();
	}
	@Test(priority=8,enabled=true)
	public void memberGrpTest() throws Exception
	{
		nmp.verifymemberGrp();
	}
	@Test(priority=9,enabled=true)
	public void addressTest()
	{
		nmp.verifyaddress();
	}
	@Test(priority=10,enabled=true)
	public void NMCountryTest() throws Exception
	{
		nmp.verifyNMCountry();
	}
	@Test(priority=11,enabled=true)
	public void cityTest()
	{
		nmp.verifycity();
	}
	@Test(priority=12,enabled=true)
	public void citySubLocTest()
	{
		nmp.verifycitySubLoc();
	}
	@Test(priority=13,enabled=true)
	public void KeyPersonTest()
	{
		nmp.verifyKeyPerson();
	}
	@Test(priority=14,enabled=true)
	public void ownershipTest()
	{
	   nmp.verifyownership();
	}
	@Test(priority=15,enabled=true)
	public void gpsLocationTest()
	{
		nmp.verifygpsLocation();
	}
	@Test
	public void remarksTest()
	{
		nmp.verifyremarks();
	}
	@Test
	public void activeStaTest()
	{
		nmp.veriffyactiveSta();
	}
	@Test
	public void ServicePTTest()
	{
		nmp.verifyServicePT();
	}
	@Test
	public void drugPTTest()
	{
		nmp.verifydrugPT();
	}
	@Test
	public void discountTest()
	{
		nmp.verifydiscount();
	}
	@Test
	public void ContactDetailsTest() throws Exception
	{
		nmp.verifyContactDetails();
	}
	
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}
}
