package baseClass;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	

	    protected WebDriver driver;

	    @BeforeClass
	    public void setup() {
	        // ✅ Add ChromeOptions to disable the password manager popup
	        //ChromeOptions options = new ChromeOptions();

	        // These arguments help suppress browser-level popups
//	        options.addArguments("--disable-save-password-bubble");
//	        options.addArguments("--disable-infobars");
//	        options.addArguments("--disable-notifications");
//	        options.addArguments("--disable-credential-services");
//	        options.addArguments("--disable-password-manager-reauthentication");
//
//	        // ✅ Add preferences to turn off password manager
//	        Map<String, Object> prefs = new HashMap<>();
//	        prefs.put("credentials_enable_service", false);
//	        prefs.put("profile.password_manager_enabled", false);
//	        options.setExperimentalOption("prefs", prefs);
//
//	        driver = new ChromeDriver(options);
            driver = new EdgeDriver();


	        driver.manage().window().maximize();

	        driver.get("https://www.saucedemo.com/");

	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }

	    @AfterClass
	    public void teardown() throws InterruptedException {
	        Thread.sleep(2000);
	        driver.quit();
	    }
	}

	
//	protected WebDriver driver;
//	
//	@BeforeClass
//	
//	public void setup() {
//		
//		driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		driver.get("https://www.saucedemo.com/");
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		
//	}
//	
//    @AfterClass
//  public void teardown() throws InterruptedException {
//    	
//    	Thread.sleep(2000);
//    	
//    	driver.quit();
//    	
//	
//}
