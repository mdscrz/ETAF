package OrangeHRM;

import org.testng.annotations.Test;

import core.ActionDriver;
import core.Hooks;
import core.setup;
import pages.homePage;
import pages.loginPage;
import pages.maintenancePage;
import pages.maintenancePage_accessRecords;
import pages.myInfoPage;
import pages.pimPage;
import pages.pimPage_Configuration;
import utilities.ConfigReader;
import utilities.Utility;
import testData.*;


public class TC0010 extends Hooks {
	
	@Test(description="Verify unsuccessful Download of EE details", 
			groups = {"Regression"})
	public static void VerifyUnsuccesfulDownloadofEE() throws InterruptedException
	{
		
		
		ActionDriver.WebActions.navigateToURL(ConfigReader.getStringProps("OrangeURL"));
		setup.LoginToOrangeHRM(LoginData.username_valid,LoginData.password_valid);
		
		homePage.tab_myInfo.waitElementVisible();
		homePage.tab_myInfo.clickElement();
		myInfoPage.eeFullName.waitElementVisible();
		Thread.sleep(3000);
		myInfoPage.eeFirstName.getAttributeValue(MyInfoData.empFirstName);
		
		homePage.tab_Maintenance.waitElementVisible();
		homePage.tab_Maintenance.clickElement();
		
		maintenancePage.setpassword.waitElementVisible();
		maintenancePage.setpassword.setPassword(LoginData.password_valid);
		maintenancePage.button_Submit.waitElementVisible();
		maintenancePage.button_Submit.clickElement();
		Thread.sleep(3000);
		
		maintenancePage.header_accessRecords.waitElementVisible();
		maintenancePage.header_accessRecords.clickElement();
		
		maintenancePage_accessRecords.inputforDownloadPersonalData.waitElementVisible();
		maintenancePage_accessRecords.inputforDownloadPersonalData.setStoredValue();
		maintenancePage_accessRecords.button_Submit.clickElement();
		Thread.sleep(3000);
		
		maintenancePage_accessRecords.button_Download.waitElementVisible();
		maintenancePage_accessRecords.button_Download.clickElement();
		
		Thread.sleep(5000);
		maintenancePage_accessRecords.ValidateErrorPage.errPage500();
	
	}
	
}
