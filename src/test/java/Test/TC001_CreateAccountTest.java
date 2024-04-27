package Test;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecification;
import Pages.HomepageBB;
import Pages.LocationpageBB;

public class TC001_CreateAccountTest extends ProjectSpecification {
	
	@BeforeTest
	public void setup() {
		
	excelFile="TC001";	
		
	
	}
	
	@Test(dataProvider ="excelData")
	public void CreateAccountTest(String firstName,String lastName,String email,String password,String confirmpassword,String mobilenumber) {
		LocationpageBB obj1= new LocationpageBB(driver);
		obj1.deliveryAtUSA();
		
		HomepageBB obj	=new HomepageBB(driver);
	    
	    obj.clickAccount()
	.clickCreateanAccount()
	.enterfirstName(firstName)
	.enterlastName(lastName)
	.enterEmailAddress(email)
    .enterpassword(password)
    .enterconfirmpassword(confirmpassword)
    .entermobilenumber(mobilenumber)
    .ClickCreateanAccount();
    
    
}
	
	
}