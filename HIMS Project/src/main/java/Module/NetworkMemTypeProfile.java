package Module;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Browser.Login;

public class NetworkMemTypeProfile extends Login {
	
	@FindBy(xpath="//input[@title='Username']") private WebElement username;
	@FindBy(xpath="//input[@title='Password']") private WebElement pass;
	@FindBy(xpath="//button[@title='Login']") private WebElement logInBtn;
	
	@FindBy(xpath="//a[text()='HEALTH INSURANCE MANAGEMENT']")private WebElement HIMSBtn;
	@FindBy(xpath="//a[text()='Network Development']")private WebElement netDevBtn;
	@FindBy(xpath="//a[text()='Network Member Type Profile']")private WebElement profile;
	
	
	public NetworkMemTypeProfile()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyAppLogIn() throws Exception
	{
		username.sendKeys(readExcelFile(0, 1));
		pass.sendKeys(readExcelFile(0, 2));
		logInBtn.click();
		Thread.sleep(2000);
		
	}
	
	public void verifyHIMSBtn() throws Exception
	{
		for(int i=0;i<1;i++)
		{
			Thread.sleep(1500);
			HIMSBtn.sendKeys(Keys.DOWN);
		}
		HIMSBtn.sendKeys(Keys.ENTER);
		
		//HIMSBtn.click();
	}
	
	public void verifynetDevBtn()
	{
		netDevBtn.click();
	}
	
	public void verifyprofile()
	{
		profile.click();
	}
	
	
	
}
