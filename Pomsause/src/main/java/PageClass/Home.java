package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	WebDriver driver;
	
    public Home(WebDriver driver) {
		 
		 this.driver = driver;
		 
		 PageFactory.initElements(driver, this);
	 }
	 

    @FindBy(css = "#add-to-cart-sauce-labs-backpack")
    WebElement backpackElement;
    
    @FindBy(xpath = "//*[@data-test='add-to-cart-sauce-labs-bolt-t-shirt']")
    WebElement tshirtElement;
    
    @FindBy(css = "#add-to-cart-sauce-labs-bike-light")
    WebElement bikeLightElement;
    
    @FindBy(xpath = "(//a[@data-test='shopping-cart-link'])")
    WebElement clickCart;
    
    @FindBy(css = "#checkout")
    WebElement checkoutButton;
    
    @FindBy(css = "#first-name")
    WebElement firstname;
    
    @FindBy(css = "#last-name")
    WebElement lastname;
    
    @FindBy(css = "#postal-code")
    WebElement postalcode;
    
    @FindBy(css = "#continue")
    WebElement continuebutton;
    
    public void BackElement() {
    	backpackElement.click();
    }
    
    public void Tshirt() {
    	tshirtElement.click();
    }
    
    public void BikeElement() {
    	bikeLightElement.click();
    }
    
    public void Clickcart() {
    	clickCart.click();
    }
    
    public void Checkout() {
    	checkoutButton.click();
    }
    public void Firstname(String name) {
    	firstname.sendKeys(name);
    	
    }
    public void Lastname(String last) {
		lastname.sendKeys(last);
	}
    public void Postalcode(String code) {
		postalcode.sendKeys(code);
	}
    public void Button() {
		continuebutton.click();
	}
    
    
    
    
    
    
    
    
    
    
    
}
