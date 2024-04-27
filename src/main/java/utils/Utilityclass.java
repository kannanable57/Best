package utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.apache.commons.io.FileUtils;
import org.apache.poi.sl.usermodel.Shadow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilityclass {

public static WebDriver driver;	
	public String excelFile;
	public void launch() {
		
	driver = new ChromeDriver()	;
	driver.get("https://www.bestbuy.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void Browserclose() {
		
		driver.close();
	}
	
	
	
	
	public static String[][] readExcel(String excelfile) throws IOException{
			
	XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\suresh\\eclipse-workspace\\Bestbuyproject\\data\\"+excelfile+".xlsx");
	XSSFSheet sheet = book.getSheetAt(0);
	
	int rowcount = sheet.getLastRowNum();
	
	short columnCount = sheet.getRow(0).getLastCellNum();
	
	String [][] data = new String[rowcount][columnCount];
	for (int i = 1; i <= rowcount; i++) {
		
		XSSFRow row = sheet.getRow(i);
		
		for (int j= 0;  j < columnCount; j++) {
			
			XSSFCell cell = row.getCell(j);
			
			data[i-1][j]=(cell.getStringCellValue());
			
			data[i-1][j]=cell.getStringCellValue();
			
			
		}
		
		
		
	}
	book.close();
	
	return data;
	
	
	}
	
	public void click(WebElement element) {
		
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));	
	wait.until(ExpectedConditions.elementToBeClickable(element));	
	element.click();	
	}
	
	public void sendkeys(WebElement ele, String value) {
		
		ele.sendKeys(value);
	}
	

	// Take screenshot
	
public String getScreenshot(String screenshotName)	throws IOException {
	
	String path = " "+screenshotName+"";
	
	TakesScreenshot screenshot = ((TakesScreenshot)driver);
	File source = screenshot.getScreenshotAs(OutputType.FILE);		
	File dest = new File(path);		
	FileUtils.copyFile(source, dest);
	return path;
	
	
	
	//Shadow shadow = new Shadow(driver);
	//shadow.setImplicitWait(10);
	//Shadow.findElementByXpath("")
	
	
}
	
}	
	

