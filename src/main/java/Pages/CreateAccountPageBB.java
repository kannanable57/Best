package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Base.ProjectSpecification;

public class CreateAccountPageBB extends ProjectSpecification {

	

	@FindBy(xpath ="//span[text()='Account']")
	WebElement Account ;

	@FindBy(id="firstName")
	WebElement firstName;
	
	@FindBy(id="lastName")
	WebElement lastName;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="fld-p1")
	WebElement password;
	
	@FindBy(id="reenterPassword")
	WebElement confirmPassword;
	
	@FindBy(id="phone")
	WebElement mobileNumber;
	
	@FindBy(id="is-recovery-phone")
	WebElement recoverycheckbox;
	
	@FindBy(id="//button[text()='Create an Account']")
	WebElement CreateanAccountButton;
	
	@FindBy(xpath="//button[text()='Sign out']")
	WebElement Signout;


	
	public CreateAccountPageBB(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
	
	public CreateAccountPageBB enterfirstName(String firstname) {
		sendkeys (firstName, firstname);
		return this;
		
	}
	public CreateAccountPageBB enterlastName(String lsname) {
		lastName.sendKeys(lsname);
		return this;
	}
	public CreateAccountPageBB enterEmailAddress(String mail) {
		
		email.sendKeys(mail);
		return this;
	}
	public CreateAccountPageBB enterpassword(String pass) {
		 password.sendKeys (pass);
		return this;
	}
	public CreateAccountPageBB enterconfirmpassword(String confirmpass) {
		confirmPassword.sendKeys (confirmpass);
		return this;
	}
	
	public CreateAccountPageBB entermobilenumber(String mobnumber) {
		mobileNumber.sendKeys (mobnumber);
		return this;
	}
		public HomepageBB ClickCreateanAccount() {
			CreateanAccountButton.click();
			return new HomepageBB(driver);
		}

		
	
}
