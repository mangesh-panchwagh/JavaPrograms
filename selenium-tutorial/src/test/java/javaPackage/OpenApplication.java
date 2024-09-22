package javaPackage;

import org.openqa.selenium.By;

public class OpenApplication extends BaseTest{

	
	public void enteremail() {
		
		driver.findElement(By.id("email")).sendKeys("mangesh013456");
	}
	
	public void enterpassword() {
		driver.findElement(By.id("pass")).sendKeys("Mangesh@1234567");
	}
	
	public void loginBtnClick() {
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}
	
	public static void main(String[] args) {
		
		OpenApplication obj = new OpenApplication();
		obj.setUpMethod("chrome", "https://www.facebook.com");
		obj.maximizeWindow();
		
		obj.enteremail();
		obj.enterpassword();
		obj.loginBtnClick();
		
		//obj.close();
		
	}
}
