package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	WebDriver driver;

	public Loginpage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterusername(String email) {
		driver.findElement(By.id("email")).sendKeys(email);
	}

	public void enterpassword(String password) {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	}

	public void clickonloginbutton() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}














