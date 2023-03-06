package Module;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Browser.Login;

public class NetworkMemberProfile extends Login {
	
	Aliment2 ele;
	
	@FindBy (xpath="//a[text()='Network Member Profile']")private WebElement NetMemPro; 
	
	@FindBy (xpath="//span[text()='New']")private WebElement newBtn;
	@FindBy (xpath="(//select[@name='type'])[1]")private WebElement ProviderCon;
	@FindBy (xpath="(//select[@name='type'])[2]")private WebElement NMGroupTy;  //When user select NM Group Entity
	@FindBy (xpath="//input[@placeholder='Network Member']")private WebElement networkEnt;
	@FindBy (xpath="//select[@name='currency']")private WebElement currency;
	@FindBy (xpath="//input[@placeholder='Name']")private WebElement name;
	@FindBy (xpath="//input[@placeholder='Code']")private WebElement code;
	@FindBy (xpath="(//select[@name='type'])[3]")private WebElement memberGrp;
	@FindBy (xpath="//textarea[@placeholder='Address']")private WebElement address;
	@FindBy (xpath="//select[@name='country']")private WebElement NMCountry;
	@FindBy (xpath="//input[@placeholder='City']")private WebElement city;
	@FindBy (xpath="(//select[@name='type'])[4]")private WebElement citySubLoc;
	@FindBy (xpath="//input[@placeholder='Phone']")private WebElement phone;
	@FindBy (xpath="//input[@placeholder='Fax']")private WebElement fax;
	@FindBy (xpath="(//input[@placeholder='Email'])[1]")private WebElement Email1;
	@FindBy (xpath="//input[@placeholder='Key Person']")private WebElement Keyperson;
	@FindBy (xpath="//input[@placeholder='Designation']")private WebElement KPdesignation;
	@FindBy (xpath="//input[@placeholder='Mobile']")private WebElement KPmobile;
	@FindBy (xpath="(//input[@placeholder='Email'])[2]")private WebElement KPmail;
	@FindBy (xpath="//input[@placeholder='URL']")private WebElement url;
	@FindBy (xpath="(//select[@name='type'])[5]")private WebElement ownership;
	@FindBy (xpath="//input[@placeholder='GPS Location']")private WebElement gpsLocation;
	@FindBy (xpath="//textarea[@placeholder='Remarks']")private WebElement remarks;
	@FindBy (xpath="//input[@value='Active']")private WebElement activeSta;
	@FindBy (xpath="(//button[@type='button'])[2]")private WebElement ServicePT;
	@FindBy (xpath="(//button[@type='button'])[3]")private WebElement drugPT;
	@FindBy (xpath="//input[@placeholder='Discount Percent']")private WebElement discount;
	@FindBy (xpath="//input[@placeholder='Negotiation Factor']")private WebElement Negfactor;
	@FindBy (xpath="//span[text()='Special Instruction']")private WebElement speInstr;
	
	
//Special Instruction	
	@FindBy (xpath="//label[text()='select file']")private WebElement selectfile;
	@FindBy (xpath="//button[text()='Upload']")private WebElement upload;
	
// File Attachments	
	@FindBy (xpath="//select[@placeholder='Authority']")private WebElement authority;
	@FindBy (xpath="//input[@placeholder='Facility ID']")private WebElement facilityID;
	@FindBy (xpath="//input[@id='mat-input-0']")private WebElement effectiveDate;
	@FindBy (xpath="//input[@id='mat-input-1']")private WebElement expiredOn;
	@FindBy (xpath="//button[@id='btnAuthadd']")private WebElement addBtn;
	
	
//Facility ID Details	
	@FindBy (xpath="//input[@placeholder='FL ID']")private WebElement FlID;
	@FindBy (xpath="//input[@id='mat-input-2']")private WebElement fromdate;
	@FindBy (xpath="//input[@id='mat-input-3']")private WebElement todate;
	@FindBy (xpath="(//button[@id='btnadd'])[2]")private WebElement addBtn2;
	

//Contact Details	
	@FindBy (xpath="//td//input[@class='form-control ng-pristine ng-valid ng-touched']")private WebElement conName;
	@FindBy (xpath="(//input[@type='text'])[12]")private WebElement desgn;
	@FindBy (xpath="(//td//input[@type='text'])[3]")private WebElement phone2;
	@FindBy (xpath="(//td//input[@type='text'])[4]")private WebElement email2;
	@FindBy (xpath="(//td//input[@type='text'])[5]")private WebElement remark;
	
	@FindBy (xpath="//span[text()='Save']")private WebElement saveBtn;
	
	public void NetworkMemberProfile()
	{
		PageFactory.initElements(driver, this);
	}
	public void verifyNetMemPro()
	{
		NetMemPro.click();
	}
	
	public void verifynewBtn()
	{
		newBtn.click();
	}
	
	public void verifyProviderCon() throws Exception
	{
		ProviderCon.click();
		
		for(int i=0;i<=2;i++)
		{
			Thread.sleep(1500);
			ProviderCon.sendKeys(Keys.DOWN);
		}
		ProviderCon.sendKeys(Keys.ENTER);
	}
	
	public void verifyNMGroupTy() throws Exception         //When user select NM Group Entity
	{
		NMGroupTy.click();
		
		for(int i=0;i<=1;i++)
		{
			Thread.sleep(1500);
			NMGroupTy.sendKeys(Keys.DOWN);
		}
		NMGroupTy.sendKeys(Keys.ENTER);
	}
	public void verifynetworkEnt()                      //When user select NM Group Provider
	{
		networkEnt.click();
	}
	public void verifycurrency() throws Exception
	{
		currency.click();
		
		for(int i=0;i<=2;i++)
		{
			Thread.sleep(1500);
			currency.sendKeys(Keys.DOWN);
		}
		currency.sendKeys(Keys.ENTER);
	}
	public void verifyname()
	{
		name.sendKeys(readExcelFile(row, col));
	}
	public void vrfycode()
	{
		code.sendKeys(auto);
	}
	public void verifymemberGrp() throws Exception
	{
		memberGrp.click();
		Thread.sleep(1500);
		for(int i=0;i<=5;i++)
		{
			//memberGrp.sendKeys(ele.verifyName());            //To capture the data from previous screen(Network Member Type Profile)
			memberGrp.sendKeys(Keys.DOWN);
		}
		memberGrp.sendKeys(Keys.ENTER);
	}
	public void verifyaddress()
	{
		address.sendKeys(readExcelFile(0,0));
	}
	public void verifyNMCountry() throws Exception
	{
		NMCountry.click();
		
		for(int i=0;i<=10;i++)
		{
			Thread.sleep(1500);
			NMCountry.sendKeys(Keys.DOWN);
		}
		NMCountry.sendKeys(Keys.ENTER);
	}
	public void verifycity()
	{
		city.sendKeys(readExcelFile(row, col));
	}
	public void verifycitySubLoc()
	{
		citySubLoc.click();
		
		for(int i=0;i<=2;i++)
		{
			citySubLoc.sendKeys(Keys.DOWN);
		}
		citySubLoc.sendKeys(Keys.ENTER);
	}
	
	
	public void verifyKeyPerson()
	{
		phone.sendKeys(readExcelFile(row, col));
		Thread.sleep(2000);
		fax.sendKeys(readExcelFile(row, col));
		Thread.sleep(2000);
		Email1.sendKeys(readExcelFile(row, col));
		Thread.sleep(2000);
		Keyperson.sendKeys(readExcelFile(row, col));
		Thread.sleep(2000);
		KPdesignation.sendKeys(readExcelFile(row, col));
		Thread.sleep(2000);
		KPmobile.sendKeys(readExcelFile(row, col));
		Thread.sleep(2000);
		KPmail.sendKeys(readExcelFile(row, col));
		Thread.sleep(2000);
		url.sendKeys(readExcelFile(row, col));	
	}
	
	public void verifyownership()
	{
		ownership.click();
		for(int i=0;i<=1;i++)
		{
			ownership.sendKeys(Keys.DOWN);
		}
		ownership.sendKeys(Keys.ENTER);
	}
	public void verifygpsLocation()
	{
		gpsLocation.sendKeys(readExcelFile(row, col));
	}
	public void verifyremarks()
	{
		remarks.sendKeys(readExcelFile(row, col));
	}
	public void veriffyactiveSta()
	{
		activeSta.click();
	}
	
	
	
	public void verifyServicePT()
	{
		ServicePT.sendKeys(readExcelFile(row, col));
	}
	public void verifydrugPT()
	{
		drugPT.sendKeys(readExcelFile(row, col));
	}
	public void verifydiscount()
	{
		discount.sendKeys(readExcelFile(row, col));
	}
	
	
//Contact Details	
	
	public void verifyContactDetails() throws Exception
	{
		Thread.sleep(2000);
		conName.sendKeys(readExcelFile(row, col));
		Thread.sleep(2000);
		desgn.sendKeys(readExcelFile(row, col));
		Thread.sleep(2000);
		phone2.sendKeys(readExcelFile(row, col));
		Thread.sleep(2000);
		email2.sendKeys(readExcelFile(row, col));
		Thread.sleep(2000);
		remark.sendKeys(readExcelFile(row, col));
		
	}
	
	public void verifysaveBtn()
	{
		 saveBtn.click();
	}


}
