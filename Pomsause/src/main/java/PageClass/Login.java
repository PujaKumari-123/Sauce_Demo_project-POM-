package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	 WebDriver driver;
	 
	 public Login(WebDriver driver) {
		 
		 this.driver = driver;
		 
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(id = "user-name")
	 WebElement Username;
	 
	 @FindBy(css = "#password")
	 WebElement passWord;
	 
	 @FindBy(css = "#login-button")
	WebElement loginButton;
	 
	 public void userName(String name) {
		 Username.sendKeys(name);
	 }
	 public void Password(String pass) {
		 passWord.sendKeys(pass);
	 }
	 public void submitButton() {
		 loginButton.click();
	 }
}
