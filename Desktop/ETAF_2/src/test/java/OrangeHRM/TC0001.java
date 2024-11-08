package OrangeHRM;

import org.testng.annotations.Test;

import core.ActionDriver;
import core.Hooks;
import core.setup;
import pages.homePage;
import pages.loginPage;
import utilities.ConfigReader;
import testData.*;


public class TC0001 extends Hooks {
	
	@Test(description="Verify Default setup upon initial load", 
			groups = {"Regression"})
	public static void VerifyDefaultSetupOnInitialLoad()
	{
		ActionDriver.WebActions.navigateToURL(ConfigReader.getStringProps("OrangeURL"));
		
		setup.LoginToOrangeHRM(LoginData.username_valid,LoginData.password_valid);
		homePage.homePageLogo.assertElementDisplayed();
		homePage.defaulSelectedTab.assertElementDisplayed();
		homePage.defaultHeader.assertElementDisplayed();
	
	}
	
}
