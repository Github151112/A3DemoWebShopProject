package com.Ecommerce.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BaseTest {

	public CheckOutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@onclick='Billing.save()']")
	private WebElement billingContinue;

	@FindBy(xpath = "//input[@onclick='Shipping.save()']")
	private WebElement shippingContinue;

	@FindBy(xpath = "//input[@onclick='ShippingMethod.save()']")
	private WebElement shippingMethodContinue;

	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")
	private WebElement paymentMethodContinue;

	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']")
	private WebElement paymentinfoContinue;

	@FindBy(xpath = "//input[@value='Confirm']")
	private WebElement confirmButton;

	@FindBy(linkText = "Click here for order details.")
	private WebElement orderDetailsLink;

	@FindBy(xpath = "//a[text()='PDF Invoice']")
	private WebElement pdfInvoiceButton;

	public void getOrderDetails() {
		billingContinue.click();
		shippingContinue.click();
		shippingMethodContinue.click();
		paymentMethodContinue.click();
		paymentinfoContinue.click();
		confirmButton.click();
		orderDetailsLink.click();
		pdfInvoiceButton.click();
	}

}
