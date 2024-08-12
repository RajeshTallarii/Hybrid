package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_001_LoginTest extends BaseClass {

	@Test
	public void verify_Login() throws InterruptedException {
		//here we are passing driver, because in loginpage constructor is there,constructor is trying to invoke at runtime
		LoginPage lp = new LoginPage(driver);
	    lp.setPassword("standard_user");
	    lp.setPassword("secret_sauce");
	    lp.clickLogin();

		String confmsg = lp.getConfirmationMsg();
		Assert.assertEquals(confmsg, "Swag Labs");

	}

}
