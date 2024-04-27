package Test;

import org.testng.annotations.Test;

import Base.ProjectSpecification;
import Pages.CartPageBB;
import Pages.CheckoutPageBB;
import Pages.LocationpageBB;

public class TC010CheckoutTest extends ProjectSpecification {

	
	
@Test
public void CheckoutpageTest( )  {
	
	LocationpageBB obj1= new LocationpageBB(driver);
	obj1.deliveryAtUSA();
	
	
	
	CartPageBB obj2 = new CartPageBB(driver);
    obj2.searchinput("LG - 31.7 Cu. Ft. French Door Smart Refrigerator with Internal Water Dispenser - Stainless Steel").submitsearch().LenovoIdeapad1LaptopAddtocart();
    
    CheckoutPageBB obj = new CheckoutPageBB<Object> (driver);
    
    
    
    
	obj
	.GotocartButton()
	.pickup()
	.Checkout()
	
	.Continue()
	.enteremailAddress("kannanable57@gmail.com")
	.enterphoneNumber("9159592031")
	.ContinueToPaymentInformation()
	.enterfirstname("Marikannan")
	.enterlastName("Subbiah")
	.enteraddress( "Sattur")
	.entercity("Madurai")
	.enterStateselect("Tamilnadu")
	.enterpostalCode("626203")
	.enterPhnumber("9159592031")
	.clickPlaceYourORder();
	
}
	

}
	
	
	
	

