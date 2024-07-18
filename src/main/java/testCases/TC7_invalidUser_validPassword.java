package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC7_invalidUser_validPassword extends ProjectSpecificMethod{

	@Test
	public void test_invalidUser_validPassword() {
		
        LoginPage obj=new LoginPage(driver);
		
		obj.enterLogin("&*#user12");
		obj.enterPassword("test");
		obj.clickLoginButton();
		
		String expectedErrorMessage = "Invalid login\n" + "and/or password" ;
			
		String actualErrorMessage =obj.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
		
	}
}
