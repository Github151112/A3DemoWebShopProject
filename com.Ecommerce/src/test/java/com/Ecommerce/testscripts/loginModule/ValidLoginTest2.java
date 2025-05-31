package com.Ecommerce.testscripts.loginModule;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Ecommerce.genericLibrary.BaseClass;
import com.Ecommerce.objectRepository.LoginPage;
import com.Ecommerce.objectRepository.WelcomePage;

public class ValidLoginTest2 extends BaseClass {

	@Test
	public void login() throws InterruptedException {
		SoftAssert s = new SoftAssert();
		// click on login link
		WelcomePage wp = new WelcomePage(driver);
		s.assertEquals(wp.getDemoLogo().isDisplayed(), false);
		wp.getLoginLink().click();
		// perform login
		LoginPage lp = new LoginPage(driver);
		lp.loginFunctionality("dee01@gmail.com", "12345678");
		s.assertAll();

	}

}
