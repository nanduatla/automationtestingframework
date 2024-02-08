package rigister;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;

public class Rigistertest extends Base {
 
	WebDriver driver;
	
  @BeforeMethod
	 public void setup() {
	    
		driver = launchBrowserAndEnterurlapplication();
	}

  @AfterMethod
	public void teardown() {
	    driver.quit();
  }
	
	@Test
public void rigisterwithallmandatoryfields() {	
	    
	Rigisterpage rigister =new Rigisterpage(driver);
	rigister.entercreatenewaccount();
	rigister.enterfirstname();
	rigister.enterlastname();
	rigister.enteremail();
	rigister.enterpassword();
	rigister.enterday();
	rigister.entermonth();
	rigister.enteryear();
	rigister.entervalue();
	rigister.entersubmit();
	
	}
}