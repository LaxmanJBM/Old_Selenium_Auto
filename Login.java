package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Files;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends Files{
	
protected static WebDriver driver;
	
//Hi This is for Demo pursose
	public void initilizationB()
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();                                         //We can take test data in same page under the Network MemberType Profile
	//	driver.get(readExcelFile(0, 0));
		driver.get("https://jbmahuat.jbmcloud.com/JBM_HIMS/General/Forms/LoginV2.aspx");
		driver.manage().window().maximize();
	}
}
