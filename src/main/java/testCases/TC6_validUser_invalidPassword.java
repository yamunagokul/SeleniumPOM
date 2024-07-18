package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC6_validUser_invalidPassword extends ProjectSpecificMethod{

	@Test
	public void test_validUser_invalidPassword() {
		
        LoginPage obj=new LoginPage(driver);
		
		obj.enterLogin("user");
		obj.enterPassword("test54&*");
		obj.clickLoginButton();
		
		String expectedErrorMessage = "Invalid login\n" + "and/or password" ;
			
		String actualErrorMessage =obj.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
		
	}
}
