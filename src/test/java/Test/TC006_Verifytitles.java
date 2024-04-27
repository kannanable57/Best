package Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



import Base.ProjectSpecification;
import Pages.HomepageBB;
import Pages.LocationpageBB;

public class TC006_Verifytitles extends ProjectSpecification {

	
	@Test
	public void HomepageBB() throws Throwable {
		LocationpageBB obj1= new LocationpageBB(driver);
		obj1.deliveryAtUSA();  
		
		
		HomepageBB obj = new HomepageBB(driver);
	
		//String my_title=driver.getTitle();
		 
		//System.out.println("title is"+my_title);
		
		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
		String expectedTitle = "Top Deals and Featured Offers on Electronics - Best Buy";
		
		String actualTitle=driver.getTitle();
		
		//Assert.equals(actualTitle.contains("//a[text()='Top Deals']"));
		
	   Assert.assertEquals(actualTitle, expectedTitle);
		
		//System.out.println("Test completed-  Page verfied");
	
	   // driver.close();
	
	
	
	
	
	}	
}
