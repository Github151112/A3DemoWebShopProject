package com.Ecommerce.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BaseTest {

	public ProductPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[text()='Computing and Internet']/../..//input[@value='Ad]")
	private WebElement bookProduct;

	public WebElement getBookProduct() {
		return bookProduct;
	}

}
