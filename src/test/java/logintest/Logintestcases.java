package logintest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import login.Loginpage;

public class Logintestcases  extends Base{

	WebDriver driver;

	public Logintestcases () {
	 super ();
	
	}
	
	@BeforeMethod
	public void setup() {

		driver = launchBrowserAndEnterurlapplication();
}
    @AfterMethod
	public void teardown() {
	    driver.quit();
    }
	
	@Test(priority = 1)
	public void loginWithValidusernameandValidpassword() throws Exception {

		Loginpage loginpage = new Loginpage(driver);
		loginpage.enterusername(prop.getProperty("username"));
		loginpage.enterpassword(prop.getProperty("password"));
		loginpage.clickonloginbutton();

		Thread.sleep(3000);

	}

	@Test(priority = 2)
	public void loginwithinvalidusernameandValidpassword() throws Exception {

		Loginpage loginpage = new Loginpage(driver);
		loginpage.enterusername(prop.getProperty("username"));
		loginpage.enterpassword(prop.getProperty("username"));
		loginpage.clickonloginbutton();

		Thread.sleep(3000);

	}

	@Test(priority = 3)
	public void loginwithvalidusernameandinvalidpassword() throws Exception {

		Loginpage loginpage = new Loginpage(driver);
		loginpage.enterusername(prop.getProperty("username"));
		loginpage.enterpassword(prop.getProperty("username"));
		loginpage.clickonloginbutton();

		Thread.sleep(3000);

	}

	@Test(priority = 4)
	public void loginwithnousernameandnopassword() throws Exception {

		Loginpage loginpage = new Loginpage(driver);
		loginpage.clickonloginbutton();

		Thread.sleep(3000);

	}
}
	
	





