package Test;

import java.awt.Menu;

import org.testng.annotations.Test;

import Base.ProjectSpecification;
import Pages.HomepageBB;
import Pages.LocationpageBB;

public class TC004_Menudepartment extends ProjectSpecification {

	@Test
	public void MenuPage() throws Throwable {
		
		LocationpageBB obj1= new LocationpageBB(driver);
		obj1.deliveryAtUSA();
		HomepageBB obj=new  HomepageBB(driver);
		
		obj.clickMenu()
		.AppliancesMenu()
		.MajorKitchenAppliancesInnerMenu()
		.RefrigeratorsInnerMenu2()
		.MiniFridges()
     .FrigidaireRetro10L();
}
}