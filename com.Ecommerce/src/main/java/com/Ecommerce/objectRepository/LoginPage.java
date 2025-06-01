package com.Ecommerce.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseTest {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "Email")
	private WebElement emailTextField;

	@FindBy(id = "Password")
	private WebElement passwordTextField;

	@FindBy(id = "RememberMe")
	private WebElement rememberMeCheckbox;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;

	@FindBy(linkText = "Log out")
	private WebElement logoutLink;

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getRememberMeCheckbox() {
		return rememberMeCheckbox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public void loginFunctionality(String email, String password) throws InterruptedException {
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		rememberMeCheckbox.click();
		loginButton.click();
	}

}
