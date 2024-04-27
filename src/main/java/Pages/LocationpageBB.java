package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Base.ProjectSpecification;

public class LocationpageBB  extends ProjectSpecification {

	@FindBy(xpath="//a[@class='canada-link']")
	WebElement countryCanada;
	
	
	@FindBy(xpath="//a[@class='us-link']")
	WebElement countryUSA;
	
	
	
	
	public LocationpageBB(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void deliveryAtUSA()	{
		click(countryUSA);
	}
	
	public void deliveryAtCanada() {	
	click(countryCanada);
	}
	//public String bestBuyPageTittle() throws Exception {	
		//return getPageTittle();
	//}	
	//public int urlResponseCode() throws Exception {
	//return getResponseCode(readProperty("url"));
	}
	
	
	
	
	
	
	
	

