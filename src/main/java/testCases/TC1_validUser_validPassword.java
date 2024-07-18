package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.HomePage;
import pages.LoginPage;

public class TC1_validUser_validPassword extends ProjectSpecificMethod{

	
	@Test
	public void test_validUser_validPassword() {
		
		LoginPage obj=new LoginPage(driver);
		
		obj.enterLogin("user");
		obj.enterPassword("test");
		obj.clickLoginButton();
		
		HomePage objHomePage=new HomePage(driver);
		
		String expectedText="Login Successful";
		Assert.assertEquals(objHomePage.getSuccessMessage(), expectedText);
	
	} 
}
	


