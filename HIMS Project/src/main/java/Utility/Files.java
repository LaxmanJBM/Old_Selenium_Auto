package Utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Files {
	
public static WebDriver driver;
	
	public static String readExcelFile(int row,int col) throws Exception
	{
		FileInputStream file=new FileInputStream("C:\\Users\\laxman\\OneDrive\\Desktop\\Testing\\Automation_Project\\HIMS Project\\Test Data1\\HIMS DATA.xlsx");
		Sheet excelSheet = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = excelSheet.getRow(row).getCell(col).getStringCellValue();
	 	return value;
	}
	
	
	
	public void captureScreenshotFaildTC(String methodName) throws Throwable
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\laxman\\OneDrive\\Desktop\\Testing\\Automation_Project\\HIMS Project\\Screenshots"+ methodName+ ".png");
		FileHandler.copy(source, destination);
	}
}
