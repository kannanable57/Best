package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecification;
import Pages.CartPageBB;
import Pages.HomepageBB;
import Pages.LocationpageBB;

public class TC003_CartTest extends ProjectSpecification {

	
	
	
	//@BeforeTest
	//public void setup() {	
	
	
		@Test
		public void CartPageTest( ) throws Throwable {
			LocationpageBB obj1= new LocationpageBB(driver);
			obj1.deliveryAtUSA();
			
			//new  HomepageBB(driver)
			CartPageBB obj = new CartPageBB(driver);
	      obj.searchinput("LenovoIdeapad1Laptop").submitsearch().LenovoIdeapad1LaptopAddtocart();
	
	
	
	
	
	
	
	
}

		
	}
