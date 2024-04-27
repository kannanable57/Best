package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.ProjectSpecification;

public class MenuPage extends ProjectSpecification{

	
	//@FindBy(xpath ="//button[@aria-label='Menu']")
	//WebElement MenuButton;
	
	//@FindBy(xpath ="//button[@data-lid='ubr_app']")
	//WebElement ApplianceMenu;
	
	//@FindBy(xpath ="//button[@data-lid='ubr_app_mka']")
	//WebElement MajorKitchenAppliancesInnerMenu;
	
	
	//@FindBy(xpath ="//a[text()='Refrigerators']")
	//WebElement RefrigeratorsInnerMenu2;
	
	
	
	@FindBy(xpath ="/a[text()='Mini Fridges']")
	WebElement MiniFridges;
	
	@FindBy(xpath ="//a[text()='Frigidaire - Retro 10L, 15-can Mini Fridge - Gray/Black']")
	WebElement FrigidaireRetro10L;
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath ="//button[@data-lid='ubr_tv']")
	WebElement TvHomeMenu;
	
	@FindBy(xpath ="//button[@data-lid='ubr_cp']")
	WebElement CompandTabletMenu;
	
	@FindBy(xpath ="//button[@data-lid='ubr_mob']")
	WebElement CellPhonesMenu;
	
	@FindBy(xpath ="//button[@data-lid='ubr_au']")
	
	WebElement Audio ;
	
	@FindBy(xpath ="//button[@data-lid='ubr_gmm']")
	WebElement VideoGames;
	
	@FindBy(xpath ="//button[@data-lid='ubr_cc']")
	WebElement CemeraCamcord;
	
	@FindBy(xpath ="//button[@data-lid='ubr_hof']")
	WebElement HomeFurniture;
	
	
	public MenuPage(WebDriver driver) {
		this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	
	
	
		
	    public MenuPage MiniFridges() {
			click(MiniFridges);
			return this;
		}
	    
	    public MenuPage FrigidaireRetro10L() {
			click(FrigidaireRetro10L);
			return this;
		}
	    
	    
	    
	    
}