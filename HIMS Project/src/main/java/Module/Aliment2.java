package Module;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Browser.Login;

public class Aliment2 extends Login {
	
	@FindBy(xpath="//i[@class='fa fa-file']")private WebElement newBtn;
	@FindBy(xpath="//input[@placeholder='Name']")private WebElement name;
	@FindBy(xpath="//input[@placeholder='Short Name']")private WebElement shortName;
	@FindBy(xpath="//select[@name='type']")private WebElement netType;
	@FindBy(xpath="//textarea[@placeholder='Remarks']")private WebElement remark;
	@FindBy(xpath="//span[text()='Save']")private WebElement saveBtn;
	
	@FindBy(xpath="//span[text()='Search']")private WebElement searchBtn1;
	@FindBy(xpath="//button[text()='Search']")private WebElement searchBtn2;
	@FindBy(xpath="//span[text()='Edit']")private WebElement editBtn;
	@FindBy(xpath="//input[@placeholder='Short Name']")private WebElement shortName2;
	@FindBy(xpath="//span[text()='Save']")private WebElement saveBtn2;
	
	
	
	public Aliment2()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyNewBtn() throws Exception
	{
		Set<String> window = driver.getWindowHandles();
	    
	    
	    Iterator<String> it = window.iterator();
	    
	    
	    String mainpage=driver.getWindowHandle();
	    while(it.hasNext())
	    {
	    	String str=it.next();	
	    	if(!mainpage.equals(str))
	    	{
	    		
	    		driver.switchTo().window(str);  		
	    	}   	
	    }
	   
		newBtn.click();
		Thread.sleep(2000);
	}
	
	public void verifyName() throws Exception
	{
		Thread.sleep(2000);
		name.sendKeys(readExcelFile(0, 3));
	}
	public void verifyShortName() throws Exception
	{
		Thread.sleep(2000);
		shortName.sendKeys(readExcelFile(0, 4));
	}
	public void verifyNetType() throws Exception
	{
		for(int i=0;i<=2;i++)
		{
		      Thread.sleep(1500);	
		      netType.sendKeys(Keys.DOWN);
		}
		netType.sendKeys(Keys.ENTER);
	}
	
	public void verifyRemark() throws Exception
	{
		Thread.sleep(2000);
		remark.sendKeys(readExcelFile(0, 5));
	}
	
	public void verifySaveBtn() throws Exception
	{
		saveBtn.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	
	
	
	
	
	
	
	public void verifySearchBtn1()
	{
		searchBtn1.click();
	}
	public void verifySearchBtn2() throws Exception
	{
		searchBtn2.click();
		
		for(int i=0;i<=5;i++)
		{
			Thread.sleep(2000);
			searchBtn2.sendKeys(Keys.DOWN);
		}
		searchBtn2.sendKeys(Keys.ENTER);
	}
	
	public void verifyEdit() throws Exception
	{
		Thread.sleep(2000);
		editBtn.click();
	}
	
	public void verifyShortName2() throws Exception
	{
		Thread.sleep(2000);
		shortName2.sendKeys(readExcelFile(4, 0));
	}
	public void verifySaveBtn2() throws Exception
	{
		Thread.sleep(2000);
		saveBtn2.click();
	}

}
