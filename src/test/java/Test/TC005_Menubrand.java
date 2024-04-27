package Test;

import org.testng.annotations.Test;

import Base.ProjectSpecification;
import Pages.HomepageBB;
import Pages.LocationpageBB;

public class TC005_Menubrand extends ProjectSpecification {

	@Test
	public void Menubrand() throws Throwable {
		
		LocationpageBB obj1= new LocationpageBB(driver);
		obj1.deliveryAtUSA();
		
		// new HomepageBB(driver);
		 HomepageBB obj	=new HomepageBB(driver);
		 
		 
	obj .clickMenu()
	.brands()
	.LG()
	.Computing()
	.LGLaptops()
	.LGgramStyleLaptop();
	
	
	}
	
}
