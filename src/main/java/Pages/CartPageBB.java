package Pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Base.ProjectSpecification;

public class CartPageBB extends ProjectSpecification{

	



	@FindBy(xpath="//input[@id='gh-search-input']")
	WebElement searchinput;
	
	
	@FindBy(xpath="//button[@title='submit search']")
	WebElement submitsearch ;                                                                                    
	
	
	
	@FindBy(xpath="//div[@id='shop-sku-list-item-40419544']")
	WebElement LenovoIdeapad1Laptop;
	
	
	@FindBy(xpath="(//button[contains(@class,'c-button c-button-primary c-button-sm c-button-block c-button')])[1]")
	WebElement  LenovoIdeapad1LaptopAddtocart;


	//Set<string> s = driver.getWindowHandle();
	//ArrayList ar = new ArrayList(s);
	//System.out.println(ar.get(0));
	//System.out.println(ar.get(1));

    // driver.switchTo().window((String)ar.get(1));
	
	
	public CartPageBB(WebDriver driver) {
		this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	
	public CartPageBB searchinput (String brandname) {
		searchinput.sendKeys(brandname);
		return this;
	}
	public CartPageBB submitsearch() {
		click(submitsearch);
		return this;
	}
	public CartPageBB LenovoIdeapad1LaptopAddtocart() {
         click(LenovoIdeapad1LaptopAddtocart);
	     return this;
	} 
	
	
	
	
}
	
	
	
	
	
	

