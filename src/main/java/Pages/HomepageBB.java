package Pages;

import java.awt.Menu;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.internal.BaseClassFinder;

import com.github.dockerjava.api.model.Driver;


import Base.ProjectSpecification;

public class HomepageBB extends ProjectSpecification {
	@FindBy(xpath ="//a[text()='Top Deals']")
	WebElement topDealsMenu;

	@FindBy(xpath ="//a[text()='Deal of the Day']")
	WebElement DealoftheDayMenu;

	@FindBy(xpath ="//a[text()='Yes, Best Buy Sells That']")
	WebElement YesBestBuySellsThatMenu;

	
	@FindBy(xpath ="//span[text()='More']")
	WebElement MoreMenu;


	@FindBy(xpath ="//a[text()='My Best Buy Memberships']")
	WebElement MyBestBuyMembershipsMenu;

	@FindBy(xpath ="//li [@ class ='liDropdownList']//a[text()='Credit Cards']")
	WebElement CreditCardsMenu;

	@FindBy(xpath ="//li {@ class ='liDropdownlist']//a[text()='Gift Cards']")
	WebElement GiftCardsMenu;


	@FindBy(xpath ="//li [@ class ='lidropdownlist']//a[text()='Gift Ideas']")
	WebElement GiftIdeasMenu;

	

	@FindBy(xpath ="//a[text()='Yardbird']")
	WebElement YardbirdMenu;
	
	@FindBy(xpath ="//a[text()='Best Buy Outlet']")
	WebElement BestBuyOutletMenu;
	
	@FindBy(xpath ="//a[text()='Best Buy Business']")
	WebElement BestBuyBusinessMenu;
	
	@FindBy(xpath ="//span[text()='Account']")
	WebElement Account ;

	@FindBy(xpath ="//a[text()='Sign In']")
	WebElement SignIn;

	@FindBy(xpath ="//a[text()='Create Account']")
	WebElement CreateanAccount;

	
	
	
	//Menu Brands
	
	@FindBy(xpath ="//button[@aria-label='Menu']")
	WebElement MenuButton;

	@FindBy(xpath ="//button[text()='Brands']")
	WebElement Brands;
	
	@FindBy(xpath ="//a[text()='LG']")
	WebElement LG;
	
	@FindBy(xpath ="//a[text()='Computing']")
	WebElement Computing ;
	//Menu Department
	
	@FindBy(xpath ="//a[text()='LG Laptops']")
	WebElement LGLaptops;
	
	@FindBy(xpath ="//img[@alt='LG - gram Style 14” Laptop - Intel Evo Platform 13th Gen Intel Core i7 with 16GB RAM - 512GB NVMe SSD - White - Front_Zoom']")
	WebElement LGgramStyleLaptop;
	
	
	
	
	@FindBy(xpath ="//button[@data-lid='ubr_app']")
	WebElement ApplianceMenu;
	
	@FindBy(xpath ="//button[@data-lid='ubr_app_mka']")
	WebElement MajorKitchenAppliancesInnerMenu;
	
	@FindBy(xpath ="//a[text()='Refrigerators']")
	WebElement RefrigeratorsInnerMenu2;
	
	
	
	
	@FindBy(xpath ="//button[@data-lid='ubr_tv']")
	WebElement tvInMenu;

	@FindBy(xpath ="//button[@data-lid='ubr_tv_brand']")
	WebElement tvsByBrandInnerMenu;

	@FindBy(xpath ="//a[text()='Sony TVs']")
	WebElement sonyTvsInnerMenu2;

	@FindBy(id ="gh-search-input")
	WebElement searchBox;

	@FindBy(xpath ="//button[@title='submit search']")
	WebElement searchButton;

	@FindBy(xpath ="//span[text()='Cart']")
	WebElement CartButton ;

	@FindBy(xpath ="//button[text()='Brands']")
	WebElement brandsInMenu;
	
	@FindBy(xpath ="//a[text()='Samsung']")
	WebElement SamsungInbrandsMenu;
	
	
	
	
	
	
	//menu validation
	
	@FindBy(xpath ="//button[text()='Deals']")
	WebElement Deals;
	
	
	
	
	
	
	
	
	//bottom link
	
	@FindBy(xpath = "//footer[@id='footer']")
    WebElement footer;
	
	@FindBy(xpath="//a[text()='Accessibility']")
	WebElement access;
	
	//validation of title each page
	
	//@FindBy(xpath ="//a[text()='D")
	//WebElement DealoftheDayMenu;
	
	
	
	
	public HomepageBB(WebDriver driver) {
	     this.driver = driver;
	 PageFactory.initElements(driver, this);    
	}
	
	public HomepageBB clickAccount() {
		click(Account);
		return  this;
	}
	     
	public CreateAccountPageBB  clickCreateanAccount()  { 
	     click(CreateanAccount);
	     return new CreateAccountPageBB(driver);
	    
}

	public SigninPageBB clickSignIn() {
		click(SignIn);
		return new SigninPageBB (driver);
	}
	
	public  HomepageBB clickTopDeals() {
	    click(topDealsMenu);
	   return new HomepageBB(driver);
	}
	
	public CartPageBB clickCart() {
		click(CartButton);
	    return new CartPageBB(driver);
	}

		
	public HomepageBB clickMenu() {
	    click(MenuButton);
	    return this ;
	}
	

	public  HomepageBB clickfooter() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	   return this;
	}
	
	
	public HomepageBB  access() {
		click(access);
		String expectedtext = driver.findElement(By.xpath("//h1[@class='page-title']")).getText();
		String actualtext = "Accessibility";
		
		Assert.assertEquals(actualtext, expectedtext);
		
		
    return this;	
	} 
	
	//a[text()='Accessibility']
	
	//Menu Department

	public HomepageBB  AppliancesMenu() {
		click(ApplianceMenu);
    return this;	
	} 
	
	
	
    public HomepageBB  MajorKitchenAppliancesInnerMenu() {
		click(MajorKitchenAppliancesInnerMenu);
    return this;	
      
}
    public MenuPage  RefrigeratorsInnerMenu2() {
		click(RefrigeratorsInnerMenu2);
		return new MenuPage(driver);
    }

//MenuBrand


    public HomepageBB brands() {
		click(Brands);
		return this;
	}
	
	
	public HomepageBB LG() {
		click(LG);
		return this;
	}

	
	public  HomepageBB  Computing() {
		click(Computing);
		return this;
	}

	public  HomepageBB LGLaptops () {
		click(LGLaptops);
		return this;
	}
	public  HomepageBB LGgramStyleLaptop () {
		click(LGgramStyleLaptop);
		return this;
	}
	
	
}



	

