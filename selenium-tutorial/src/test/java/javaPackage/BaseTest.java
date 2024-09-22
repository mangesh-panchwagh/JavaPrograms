package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	WebDriver driver;
	
	public void setUpMethod(String browser, String url) {
	
		if(browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if(browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else if(browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else {
			System.out.println("Valid browser was not provided. Hence quiting");
			System.exit(0);
		}
		
		if(url!="")
			driver.get(url);
		else
			driver.get("about:blank");
	}
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public void close() {
		driver.close();
	}
	
	public void quite() {
		driver.quit();
	}

}
