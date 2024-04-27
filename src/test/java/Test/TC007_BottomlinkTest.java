package Test;

import javax.annotation.processing.Filer;

import org.testng.annotations.Test;

import Base.ProjectSpecification;
import Pages.HomepageBB;
import Pages.LocationpageBB;

public class TC007_BottomlinkTest  extends ProjectSpecification {

	
	
@Test	
public void Homepage() throws Throwable {
		
		LocationpageBB obj1= new LocationpageBB(driver);
		obj1.deliveryAtUSA();
		
		HomepageBB obj	=new HomepageBB(driver);
          //new  HomepageBB(driver);
		
		obj.clickfooter()
		.access();
		 


		


}
}