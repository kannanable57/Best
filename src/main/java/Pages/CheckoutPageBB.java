package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.ProjectSpecification;

public class CheckoutPageBB<CartIcon> extends ProjectSpecification {
	
	
	
	
	//@FindBy(xpath="//span[text()='Cart']")
	//WebElement CartButton ;	

	//@FindBy(xpath="//a[@id='cart-19avpf30wl2we-4h28l0d5orkcp']")
	//WebElement LenovaLaptopText;
	
	//@FindBy(xpath="//select[@id='quantity-19avpf30wl2we-4h28l0d5orkcp']")
	//WebElement  LenovaLaptopQty ;	
		
	//@FindBy(xpath="//div[@class='price-block']")
	//WebElement  LenovaLaptopPrice;	

	
	
	
	
	
	
	
	@FindBy(xpath="//body[@class='size-l header-sticky']")
	WebElement Addtocart;
	
	
	@FindBy(xpath="//a[text()='Go to Cart']")
	WebElement GotoCart;
	
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement CheckoutButton ;
	
	@FindBy(xpath="(//div[@class='availability__title'])[1]")
	WebElement pickup;
	
	
	@FindBy(xpath="//button[@class='c-button c-button-secondary c-button-lg cia-guest-content__continue guest']")
	WebElement Continue ;
	
	
	@FindBy(xpath="//input[@id='user.emailAddress']")
	WebElement email ;
	
	
	@FindBy(xpath="//input[@id='user.phone']")
	WebElement Phonenumber ;
	
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-block btn-secondary']")
	WebElement ContinueToPaymentInformation;
	
	@FindBy(xpath="//Input[@id='first-name'")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='last-name']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='address-input']")
	WebElement address ;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement city;
	
	@FindBy(xpath="//select[@class='tb-select']")
	WebElement Stateselect;
	
	
	@FindBy(xpath="//input[@id='postalCode']")
	WebElement postalCode;
	
	@FindBy(xpath="//input[@id='number']")
	WebElement Phnumber;
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-block btn-primary']")
	WebElement PlaceYourORder;
	
	
	
	
	// payment by card
	@FindBy(xpath="//img[@class='cardGraphicsVisaImage']")
		WebElement VisaImage;
	
	
	//order by Location
	
	@FindBy(xpath="//div[@class='spu-store-information']")
	WebElement Location;
	
	
	// order by person
	
	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstName;
	
	@FindBy(xpath="//input{@id='lastName']")
	WebElement lastName ;
	
	
	
	//@FindBy(xpath="")
	//WebElement 
	
	
	public CheckoutPageBB(WebDriver driver) {
		this.driver = driver;
	PageFactory.initElements(driver, this);
	
}
	
	public CheckoutPageBB AddtoCartButton() {
		click(Addtocart);
		return this;	
	}
	
	public CheckoutPageBB GotocartButton() {
		click(GotoCart);
		return this;	
	}
	
	
	public CheckoutPageBB Checkout() {
		click(CheckoutButton);
		return this;	
	}
	
	public CheckoutPageBB pickup() {
		click(pickup);
		return this;	
	}
	
	
	public CheckoutPageBB Continue() {
		click(Continue);
		return this;	
	}
	
	
	
	public CheckoutPageBB enteremailAddress(String mail) {
		email.sendKeys(mail);
		return this;	
	}
	
	public CheckoutPageBB enterphoneNumber(String number) {
		Phonenumber.sendKeys(number);
		return this;	
	}
	
	
	public CheckoutPageBB ContinueToPaymentInformation() {
		click(ContinueToPaymentInformation);
		return this;	
	}
	
	public  CheckoutPageBB enterfirstname(String fstname) {
		firstname.sendKeys(fstname);
		return this;		
	}
	
	public  CheckoutPageBB  enterlastName(String lstname) {
		lastname.sendKeys( lstname);
		return this;
	}
	
	public  CheckoutPageBB enteraddress(String addrs) {
		address.sendKeys(addrs);
		return this;
	}
	public  CheckoutPageBB entercity(String cty) {
		city.sendKeys(cty);
		return this;
	}
	
	public  CheckoutPageBB enterStateselect(String State) {
		Stateselect.sendKeys (State);
		return this;
	}
	
	public  CheckoutPageBB  enterpostalCode(String pincode) {
		 postalCode.sendKeys (pincode);
		return this;
	}
 
	public  CheckoutPageBB enterPhnumber(String number ) {
		Phnumber.sendKeys (number);
		return this;
	}
	
	public  CheckoutPageBB  clickPlaceYourORder() {
		PlaceYourORder.click();
		return this;
	}
	
	//Atmcard
	
	public  CheckoutPageBB   VisaImageclick() {
		 VisaImage.click();
		return this;
	}
	
	
	public  CheckoutPageBB  Locationclick() {
		Location.click();
		return this;
	}
	
	
	
	
	
	
	
/*public void validatemessage() {
String expectedMessage = "";

String message = driver.findElement(By.xpath(expectedMessage)).getText();

Assert.assertEquals("your message",message.contains(expectedMessage));

}
//verify the place order message 	


WebElement msg = driver.findElement(By.xpath(""));
String text =msg.getText();
if (msg.isEnabled()&& text.contains("Registration completed successfully"))	
{
System.out.println("Successfully completed");	
}else {
	System.out.println("please enter alldetails");
}
*/	
	
}
