package testcases.login;

import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import pages.LandingPage;
import pages.LoginPage;

import pages.PlaformConfig;
import pages.Program;
import pages.Users;

public class SAMPLETEST extends wrappers.ProjectWrappers {

	public SAMPLETEST() throws IOException {
	}

	@BeforeClass
	public void TC__01_To_Verify_that_navigation_of_Change_password_Screen() {
		TestCaseName = "SAMPLE TEST";
		TestDescription = "SAMPLE TEST";
		browserName = "chrome";
		dataSheetName = "Login";
		Application = "Mobeix Admin";
		Authors = "ShubhamNew";
		
	}

	@Test(dataProvider="fetchData")
	public void TC__01_Verify_that_Reset_Password_Screen_navigates_on_1st_login_after_admin_Creates_User(String userID, String password) throws Exception {
		 new LoginPage(driver, test)
		 .enterUserID(userID)
		  	.enterPassword(password)
		  	.clickSignInBtn();
		  new LandingPage(driver, test)
		  .clickPlatformConfigMenu();
		  new PlaformConfig(driver, test)
		  .clickUserMenu(); 
		  new Users(driver, test)
		  .clickbtnAddUser()
		  .selectUserType("MAKER");
		  
		  //.enterProgramId()
		 // .clickHttpMethod();
		  
	}
}
