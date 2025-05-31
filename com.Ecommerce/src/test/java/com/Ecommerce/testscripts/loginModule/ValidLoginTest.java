package com.Ecommerce.testscripts.loginModule;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Ecommerce.genericLibrary.BaseClass;
import com.Ecommerce.objectRepository.LoginPage;
import com.Ecommerce.objectRepository.WelcomePage;

public class ValidLoginTest extends BaseClass {

	@Test
	public void login() throws InterruptedException {

		// click on login link
		WelcomePage wp = new WelcomePage(driver);
		// verify the welcome page is displayed or not
		Assert.assertEquals(wp.getDemoLogo().isDisplayed(), true);
		wp.getLoginLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login");
		// perform login
		LoginPage lp = new LoginPage(driver);
		lp.loginFunctionality("dee01@gmail.com", "12345678");
		Assert.assertEquals(lp.getLogoutLink().isDisplayed(), true);

	}

}
