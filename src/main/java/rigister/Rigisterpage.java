package rigister;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Rigisterpage {

	WebDriver driver;
	
	public Rigisterpage(WebDriver driver) {
		this.driver = driver;
	}
	 
	 public void entercreatenewaccount() {
		driver.findElement(By.partialLinkText( "Create new account")).click();
	}
	public void enterfirstname() {
		driver.findElement(By.name("firstname")).sendKeys("narendra");
	}
	public void enterlastname() {
		driver.findElement(By.name("lastname")).sendKeys("atla");
	}
	public void enteremail() {
		driver.findElement(By.name("reg_email__")).sendKeys("9618701022");
	}
	public void enterpassword() {
		driver.findElement(By.id("password_step_input")).sendKeys("narendra@16.");
	}
	public void enterday() {
		driver.findElement(By.id("day")).sendKeys("16");
	}
	public void entermonth() {
		driver.findElement(By.id("month")).sendKeys("november");
	}
	public void enteryear() {
		driver.findElement(By.id("year")).sendKeys("2000");
	}
	public void entervalue() {
		driver.findElement(By.xpath("//input[@value='2']")).click();
	}
	public void entersubmit() {
		 driver.findElement(By.name("websubmit")).click();
	}	
	
	
	
	
	
	
	
	
	
	
	
	
}
