package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.ProjectSpecification;

public class Menubrand extends ProjectSpecification {
	
	//@FindBy(xpath ="//button[@aria-label='Menu']")
	//WebElement MenuButton;
	
	@FindBy(xpath ="//button[text()='Brands']")
	WebElement Brands;
	
	//@FindBy(xpath ="//a[text()='LG']")
	//WebElement LG;
	
	
	
	@FindBy(xpath ="//a[text()='Computing']")
	WebElement Computing ;
	
	@FindBy(xpath ="//a[text()='LG Laptops']")
	WebElement LGLaptops;
	
	@FindBy(xpath ="//img[@alt='LG - gram Style 14” Laptop - Intel Evo Platform 13th Gen Intel Core i7 with 16GB RAM - 512GB NVMe SSD - White - Front_Zoom']")
	WebElement LGgramStyleLaptop;
	
	  //menu validation code
	@FindBy(xpath ="//button[text()='Deals']")
	WebElement Deals;
	
	
	
	
	
	
	public Menubrand(WebDriver driver) {
		this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	 
	 public  Menubrand brands() {
			click(Brands);
			return this;
		}
	
		
	public Menubrand  Computing() {
		click(Computing);
		return this;
	}
	
	
	public Menubrand LGLaptops () {
		click(LGLaptops);
		return this;
	}
	
	 
	public Menubrand LGgramStyleLaptop () {
		click(LGgramStyleLaptop);
		return this;
	}
	
	
	
	
	public Menubrand Deals () {
		click(Deals);
		return this;
	}
	
	
	
}
