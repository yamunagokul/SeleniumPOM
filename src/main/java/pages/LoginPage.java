package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	public LoginPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	By loginField = By.name("login");
    By passwordField = By.name("password");
    By loginButton = By.id("login-form-submit");
    By errorMessage = By.xpath("//p[text()='Invalid login ']");
    

	public void enterLogin(String login) {		
		driver.findElement(loginField).sendKeys(login);
	
	}
	
	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	
	}
	
    public void clickLoginButton() {
		
    	driver.findElement(loginButton).click();
    	
	}

	public  String getErrorMessage() {
			
		return driver.findElement(errorMessage).getText();
			
		}
	

	}


