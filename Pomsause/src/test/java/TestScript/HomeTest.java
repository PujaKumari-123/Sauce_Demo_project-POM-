package TestScript;

import org.testng.annotations.Test;

import PageClass.Home;
import PageClass.Login;
import baseClass.BaseClass;

public class HomeTest extends BaseClass {
	
	@Test
	public void clickonItem() throws InterruptedException {
		
		    // Login first
		    Login loginPage = new Login(driver);
		    
		    loginPage.userName("standard_user");
		    
		    loginPage.Password("secret_sauce");
		    
		    loginPage.submitButton();

		    Thread.sleep(2000);
		    // Perform Home page actions
		    Home homepage = new Home(driver);
		    
		    homepage.BackElement();
		    
		    homepage.Tshirt();
		    
		    homepage.BikeElement();
		    
		    homepage.Clickcart();
		    
		    homepage.Checkout();
		    
		    homepage.Firstname("John");
		    
		    homepage.Lastname("Doe");
		    
		    homepage.Postalcode("560032");
		    
		    homepage.Button();

//		    // Handle alert if present
//		    try {
//		        Alert alert = driver.switchTo().alert();
//		        alert.accept();  // or alert.dismiss();
//		    } catch (NoAlertPresentException e) {
//		        System.out.println("No alert appeared.");
//		    }
	}


	

}
