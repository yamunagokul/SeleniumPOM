package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC3_emptyUser_emptyPassword extends ProjectSpecificMethod {

	@Test
	public void testemptyUser_emptyPassword() {
		
        LoginPage obj=new LoginPage(driver);
		
		obj.enterLogin("");
		obj.enterPassword("");
		obj.clickLoginButton();
		
		String expectedErrorMessage = "Invalid login\n" + "and/or password" ;
			
		String actualErrorMessage =obj.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
		
	}
}
