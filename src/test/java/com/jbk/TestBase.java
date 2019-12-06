package com.jbk;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
//Logger log= Logger.getLogger(LoginTestCase.class)
//log.info("browser is opened...")
public class TestBase {
	//WebDriver driver=null;
	//Properties prop
	//Logger
	@BeforeSuite
	public void setupEnvironment() {
		//driver
		// profile
		// url get 
		//property read
		//cookies delete
		//implicit wait
		// initialise logger (this.getClass())
	}
	
	@AfterSuite
	public void deleteEnv() {
		//driver.quit()
	}
	
	
	
	

}
