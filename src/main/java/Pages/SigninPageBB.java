package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Base.ProjectSpecification;

public class SigninPageBB extends  ProjectSpecification {
	@FindBy(xpath ="//span[text()='Account']")
	WebElement Account ;
	
	@FindBy(id="fld-e")
    WebElement email;
	
	@FindBy(id="fld-p1")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement signInButton;
	
	@FindBy(xpath="")
	WebElement goToHomePage;
	
	public SigninPageBB(WebDriver driver) {
		this.driver = driver;
	   PageFactory.initElements(driver, this);
	}
	public SigninPageBB entermail(String mail){
	  email.sendKeys(mail);
	  return this;
	}   
	
	public SigninPageBB enterpass(String pass){
		  password.sendKeys(pass);
		  return this;
		}   
	
	public HomepageBB clickSignin() {
		signInButton.click();
	   return new HomepageBB(driver);
	   
	}																				
   }

	
	
	
	
	
	
	
	
	
	
	
	
	
	






