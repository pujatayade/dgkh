package com.jbk;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jbk.selenium.SeleniumCommonOperation;

public class LoginTestCases extends TestBase {

	@Test(dataProvider = "loginData")
	public void checkErrorMessages(String un, String pw) {
		//loger- 
		// sendkeys selenium code
		//SeleniumCommonOperation.enterText(driver, we, data);
		// validate by Assert error meessage

	}

	@DataProvider
	public Object[][] loginData() {
		return null; // read excel
	}

}
