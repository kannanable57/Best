package Base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.Utilityclass;

public class ProjectSpecification  extends Utilityclass{

	
@BeforeMethod
public  void  browserLaunch() {

	launch();
}
	
	@AfterMethod 
	public void closeBrowser() {
		
		//Browserclose();
	}
	@DataProvider
	public String[][] excelData() throws IOException {
	String data[][]=readExcel(excelFile);	
		
		
		
		
		
		return data;
}
	
}
