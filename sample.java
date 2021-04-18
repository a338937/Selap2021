package testcases.login;

import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import pages.LandingPage;
import pages.LoginPage;

import pages.PlaformConfig;
import pages.Users;

public class sample extends wrappers.ProjectWrappers {

	public sample() throws IOException {
	}

	@BeforeClass
	public void setData() {
		TestCaseName = "SAMPLE TESTCASES";
		TestDescription = "SAMPLE TESTCASES";
		browserName = "chrome";
		dataSheetName = "Login";
		Application = "Mobeix Admin";
		Authors = "Anbu Shanmugam";
		
	}

	@Test(dataProvider="fetchData")
	public void sampletest(String userID, String password) throws Exception {
		 new LoginPage(driver, test)
		 .enterUserID(userID)
		  	.enterPassword(password)
		  	.clickSignInBtn();
		  Thread.sleep(5000);
		  new LandingPage(driver, test)
		  .clickPlatformConfigMenu();
		  new PlaformConfig(driver, test)
		  .clickUserMenu();
		  Thread.sleep(5000); 
		  new Users(driver, test)
		  .clickbtnAddUser();
		  Thread.sleep(2000);
		  new Users(driver, test)
		  .selectUserType(CHECKER);
		  Thread.sleep(5000); 
		  
		  
	}
}
