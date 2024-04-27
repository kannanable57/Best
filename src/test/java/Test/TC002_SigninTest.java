package Test;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecification;
import Pages.HomepageBB;
import Pages.LocationpageBB;

public class TC002_SigninTest extends ProjectSpecification {
	
	@BeforeTest
	public void setup() {
		
	excelFile="TC002";	
		
	}
	
	@Test(dataProvider ="excelData")
	public void SigninTest(String EmailAdress,String password) {
	  
		
	LocationpageBB obj1= new LocationpageBB(driver);
	obj1.deliveryAtUSA();
	
	HomepageBB obj	=new HomepageBB(driver);
	    
	obj.clickAccount()
	.clickSignIn()
	.entermail(EmailAdress)
	.enterpass(password)
	.clickSignin();
	
	
}
}