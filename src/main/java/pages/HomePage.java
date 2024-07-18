package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod{
	
public HomePage(RemoteWebDriver driver) {
	this.driver=driver;
	}
	
//Save Success message

	By successMessage = By.xpath("//h1[text()='Login Successful']");
	
	public String getSuccessMessage()  {
		
		return driver.findElement(successMessage).getText();
	
	}

}
