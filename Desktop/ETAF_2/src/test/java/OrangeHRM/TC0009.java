package OrangeHRM;

import org.testng.annotations.Test;

import core.ActionDriver;
import core.Hooks;
import core.setup;
import pages.homePage;
import pages.loginPage;
import pages.pimPage;
import pages.pimPage_Configuration;
import utilities.ConfigReader;
import utilities.Utility;
import testData.*;


public class TC0009 extends Hooks {
	
	@Test(description="verify all tabs in homepage", 
			groups = {"Regression"})
	public static void VerifyLeftMenuOptions()
	{
		
		
		ActionDriver.WebActions.navigateToURL(ConfigReader.getStringProps("OrangeURL"));
		setup.LoginToOrangeHRM(LoginData.username_valid,LoginData.password_valid);
		homePage.tab_Dashboard.waitElementVisible();
		
		homePage.tab_Dashboard.assertElementDisplayed();
		homePage.tab_PIM.assertElementDisplayed();
		homePage.tab_Directory.assertElementDisplayed();
		homePage.tab_Performance.assertElementDisplayed();
		homePage.tab_Admin.assertElementDisplayed();
		homePage.tab_Buzz.assertElementDisplayed();
		homePage.tab_Claim.assertElementDisplayed();
		homePage.tab_Leave.assertElementDisplayed();
		homePage.tab_Maintenance.assertElementDisplayed();
		homePage.tab_myInfo.assertElementDisplayed();
		homePage.tab_Time.assertElementDisplayed();
		homePage.tab_Recruitment.assertElementDisplayed();
		
		
		
	
	}
	
}
