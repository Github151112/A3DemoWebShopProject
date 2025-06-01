package com.Ecommerce.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BaseTest {

	public WelcomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Register")
	private WebElement registerLink;

	public WebElement getRegisterLink() {
		return registerLink;
	}

	@FindBy(linkText = "Log in")
	private WebElement loginLink;

	public WebElement getLoginLink() {
		return loginLink;
	}

	@FindBy(xpath = "//img[@alt='Tricentis Demo Web Shop']")
	private WebElement demoLogo;

	public WebElement getDemoLogo() {
		return demoLogo;
	}

	@FindBy(linkText = "Shopping cart")
	private WebElement shoppingCart;

	public WebElement getShoppingCart() {
		return shoppingCart;
	}

	@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Books')]")
	private WebElement booksLink;

	public WebElement getBooksLink() {
		return booksLink;
	}

}
