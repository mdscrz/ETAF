package OrangeHRM;

import org.testng.annotations.Test;

import core.ActionDriver;
import core.Hooks;
import core.setup;
import pages.*;
import testData.AdminData;
import testData.LoginData;
import testData.MyInfoData;
import utilities.ConfigReader;


public class TC0005 extends Hooks{
	@Test(description="Verify successful add of admin role on an existing employee", 
			groups = {"Regression"})
		public static void VerifyAddedAdminRoleOnEE() throws InterruptedException
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
			
			homePage.tab_Admin.waitElementVisible();
			homePage.tab_Admin.clickElement();
			adminPage.button_Add.assertElementDisplayed();
			adminPage.button_Add.clickElement();
			
			adminPage_userManagement.dropdown_UserRole.waitElementVisible();
			adminPage_userManagement.dropdown_UserRole.clickElement();
			adminPage_userManagement.dropdown_UserRole_options.waitElementVisible();
			adminPage_userManagement.dropdown_UserRole_options.clickElement();
			
			adminPage_userManagement.dropdown_Status.clickElement();
			adminPage_userManagement.dropdown_Status_options.waitElementVisible();
			adminPage_userManagement.dropdown_Status_options.clickElement();
			
			adminPage_userManagement.inputFullName.clickElement();
			Thread.sleep(3000);
			adminPage_userManagement.inputFullName.setStoredValue();
			
			adminPage_userManagement.inputUsername.clickElement();
			//adminPage_userManagement.inputUsername.selectAll();
			adminPage_userManagement.inputUsername.setText(AdminData.userName);
			
			adminPage_userManagement.setpassword.clickElement();
			//adminPage_userManagement.setpassword.selectAll();
			adminPage_userManagement.setpassword2.setText(LoginData.password_valid);
			adminPage_userManagement.setpassword.setText(LoginData.password_valid);
			adminPage_userManagement.buttonCreateorSave.clickElement();
			
			Thread.sleep(3000);
			
			adminPage_userManagement.assertRoleOfEE.waitElementVisible();
			Thread.sleep(5000);
			adminPage_userManagement.assertRoleOfEE.assertText(AdminData.expectedRole);
			adminPage_userManagement.assertFNOfEE.assertValueEquals();
		}
			
}
