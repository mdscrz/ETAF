package OrangeHRM;

import org.testng.annotations.Test;

import core.ActionDriver;
import core.Hooks;
import core.setup;
import pages.*;
import testData.LoginData;
import testData.PIMdata;
import utilities.ConfigReader;


public class TC0004 extends Hooks{
	@Test(description="Verify different scenarios of data login to Orange HRM", 
			groups = {"Regression"})
		public static void VerifyDifferentLoginOptions() throws InterruptedException
		{
		
			ActionDriver.WebActions.navigateToURL(ConfigReader.getStringProps("OrangeURL"));
			
			setup.LoginToOrangeHRM(LoginData.username_valid,LoginData.password_valid);
			homePage.homePageLogo.assertElementDisplayed();
			homePage.dropdown_Account.waitElementVisible();
			homePage.dropdown_Account.clickElement();
			homePage.button_Logout.waitElementVisible();
			homePage.button_Logout.clickElement();
			loginPage.title_Login.assertElementDisplayed();
			
			Thread.sleep(2000);
			setup.LoginToOrangeHRM(LoginData.username_invalid,LoginData.password_valid);
			loginPage.assertLoginInvalid.waitElementVisible();
			loginPage.assertLoginInvalid.assertElementDisplayed();
			
			Thread.sleep(2000);
			setup.LoginToOrangeHRM(LoginData.username_valid,LoginData.password_invalid);
			loginPage.assertLoginInvalid.waitElementVisible();
			loginPage.assertLoginInvalid.assertElementDisplayed();
			
			Thread.sleep(2000);
			setup.LoginToOrangeHRM(LoginData.username_invalid,LoginData.password_invalid);
			loginPage.assertLoginInvalid.waitElementVisible();
			loginPage.assertLoginInvalid.assertElementDisplayed();
			
		}
			
}
