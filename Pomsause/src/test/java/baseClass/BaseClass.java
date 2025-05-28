package baseClass;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	

	    protected WebDriver driver;

	    @BeforeClass
	    public void setup() {

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

	




