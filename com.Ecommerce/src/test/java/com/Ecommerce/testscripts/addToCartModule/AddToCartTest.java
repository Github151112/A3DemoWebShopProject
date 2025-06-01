package com.Ecommerce.testscripts.addToCartModule;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Ecommerce.genericLibrary.BaseClass;
import com.Ecommerce.objectRepository.CheckOutPage;
import com.Ecommerce.objectRepository.LoginPage;
import com.Ecommerce.objectRepository.ProductPage;
import com.Ecommerce.objectRepository.ShoppingCartPage;
import com.Ecommerce.objectRepository.WelcomePage;

public class AddToCartTest extends BaseClass {
	
	@Test(groups = "ST")
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
	
	@Test(dependsOnMethods = "login",groups = {"RT","ST"})
	public void addToCart()
	{
		WelcomePage wp = new WelcomePage(driver);
		wp.getBooksLink().click();
		ProductPage pp = new ProductPage(driver);
		pp.getBookProduct().click();
		wp.getShoppingCart().click();
		ShoppingCartPage scp = new ShoppingCartPage(driver);
		scp.getTermsServicesCheckBox().click();
		scp.getCheckOutButton().click();
		CheckOutPage cop = new CheckOutPage(driver);
		cop.getOrderDetails();
		Reporter.log("add to cart test script executed successfuly",true);
		
	}
	
	
	

}
