package base;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Base {
	 WebDriver driver;
	 public Properties prop ;
	  public Base() {
	    
	    File path =new File(System.getProperty("user.dir")+"\\testData\\config.properties");
	   prop=new Properties();
	 try {
		 FileInputStream fis =new FileInputStream(path);
	      prop.load(fis);
	      System.out.println(prop.getProperty("username"));
	      System.out.println(prop.getProperty("password"));
	 
	 } catch(Exception e) {
	       e.printStackTrace();
	  }	 
	 
	  }
	 
	 
	 
	 
	 public WebDriver launchBrowserAndEnterurlapplication() {	
	
 String  browserName= "edge"	;
	
	
	if(browserName.equals("chrome")) {
	     driver = new ChromeDriver();
	}
	else if(browserName.equals("fire fox")) {
		  driver = new FirefoxDriver();
	}
	
	else if(browserName.equals("edge")) {
		  driver = new EdgeDriver();
	
	}
	else {
	    System.out.println("browser not found");
	}
	driver.get("https://WWW.facebook.com");
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
    return driver;
	}
}