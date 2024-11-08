package OrangeHRM;

import org.testng.annotations.Test;

import core.ActionDriver;
import core.Hooks;
import core.setup;
import pages.*;
import testData.*;
import utilities.ConfigReader;


public class TC0007 extends Hooks{
	@Test(description="Search employee name in Directory ", 
			groups = {""})
		public static void SearchEEinDirectory() throws InterruptedException
		{
		
			ActionDriver.WebActions.navigateToURL(ConfigReader.getStringProps("OrangeURL"));
			
			setup.LoginToOrangeHRM(LoginData.username_valid,LoginData.password_valid);
			
			homePage.tab_myInfo.waitElementVisible();
			homePage.tab_myInfo.clickElement();
			
			myInfoPage.eeFullName.waitElementVisible();
			Thread.sleep(3000);
			myInfoPage.eeFirstName.getAttributeValue(MyInfoData.empFirstName);
			myInfoPage.eeMiddleName.getAttributeValue(MyInfoData.empMiddleName);
			myInfoPage.eeLastName.getAttributeValue(MyInfoData.empLastName);
			
			homePage.tab_Directory.waitElementVisible();
			homePage.tab_Directory.clickElement();
			Thread.sleep(3000);
			directoryPage.eeFullName.setStoredValue();
			directoryPage.button_Search.waitElementVisible();
			directoryPage.button_Search.clickElement();
			
			//validation
			Thread.sleep(3000);
			directoryPage.validateSearchEE.assertElementDisplayed();
			
			
			
			
		}
			
}
