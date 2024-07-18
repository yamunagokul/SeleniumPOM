package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC5_emptyUser_validPassword extends ProjectSpecificMethod{

	@Test
	public void test_emptyUser_validPassword() {
		
        LoginPage obj=new LoginPage(driver);
		
		obj.enterLogin("");
		obj.enterPassword("test");
		obj.clickLoginButton();
		
		String expectedErrorMessage = "Invalid login\n" + "and/or password" ;
			
		String actualErrorMessage =obj.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
		
	}
}
