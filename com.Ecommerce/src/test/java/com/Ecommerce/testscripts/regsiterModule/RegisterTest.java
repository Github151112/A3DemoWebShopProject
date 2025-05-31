package com.Ecommerce.testscripts.regsiterModule;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Ecommerce.genericLibrary.BaseClass;
import com.Ecommerce.genericLibrary.ExcelUtility;
import com.Ecommerce.objectRepository.RegistrationPage;
import com.Ecommerce.objectRepository.WelcomePage;

public class RegisterTest extends BaseClass {

	@DataProvider(name = "TestData")
	public Object[][] registerData() throws EncryptedDocumentException, IOException {
		return ExcelUtility.readExcel(EXCEL_PATH, REG_SHEET);
	}

	@Test(dataProvider = "TestData")
	public void register(String gender, String firstName, String lastName, String email, String password)
			throws InterruptedException {

		// click on register link
		WelcomePage wp = new WelcomePage(driver);
		wp.getRegisterLink().click();
		// select the gender
		RegistrationPage rp = new RegistrationPage(driver);
		rp.registration(driver, gender, firstName, lastName, email, password);

	}

}
