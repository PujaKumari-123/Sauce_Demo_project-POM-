package TestScript;

import org.testng.annotations.Test;

import PageClass.Login;
import baseClass.BaseClass;

public class LoginTest extends BaseClass{

	
	@Test
	public void validCredentials() {
		
		Login log = new Login(driver);
		
		log.userName("standard_user");
		
		log.Password("secret_sauce");
		
		log.submitButton();
	}
	
	@Test
	public void InvalidCredentials() {
		
		Login log = new Login(driver);
		
		log.userName("standard");
		
		log.Password("secret_sauc");
		
		log.submitButton();
	}
}
