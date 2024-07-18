package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC2_invalidUser_invalidPassword extends ProjectSpecificMethod{

	@Test
	public void test_invalidUser_invalidPassword() {
		
		LoginPage obj=new LoginPage(driver);
		
		obj.enterLogin("user12");
		obj.enterPassword("test54");
		obj.clickLoginButton();
		
		String expectedErrorMessage = "Invalid login\n" + "and/or password" ;
			
		String actualErrorMessage =obj.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
		
	}
}
