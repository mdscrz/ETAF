package OrangeHRM;

import org.testng.annotations.Test;

import core.ActionDriver;
import core.Hooks;
import core.setup;
import pages.*;
import testData.LoginData;
import testData.PIMdata;
import utilities.ConfigReader;


public class TC0003 extends Hooks{
	@Test(description="Verify successful add employee", 
			groups = {"Regression"})
		public static void VerifysuccessfulAddofEE() throws InterruptedException
		{
		ActionDriver.WebActions.navigateToURL(ConfigReader.getStringProps("OrangeURL"));
		
		setup.LoginToOrangeHRM(LoginData.username_valid,LoginData.password_valid);
			
			homePage.tab_PIM.clickElement();
			pimPage.button_Add.waitElementVisible();
			pimPage.button_Add.clickElement();
			pimPage_addEmployee.inputFirstName.waitElementVisible();
			pimPage_addEmployee.inputFirstName.setText(PIMdata.firstName);
			pimPage_addEmployee.inputMiddleName.setText(PIMdata.middleName);
			pimPage_addEmployee.inputLastName.setText(PIMdata.lastName);
			pimPage_addEmployee.inputEEid.clickElement();
			pimPage_addEmployee.inputEEid.selectAll();
			pimPage_addEmployee.inputEEid.setInt(PIMdata.eeID);
			pimPage_addEmployee.button_Submit.clickElement();
			Thread.sleep(10000);
			
			pimPage.button_eeList.waitElementVisible();
			pimPage.button_eeList.clickElement();
			pimPage_employeeList.geteeID.setInt(PIMdata.currentEEId);
			pimPage_employeeList.button_Submit.clickElement();
			Thread.sleep(3000);
			
			//Assert successfully created employee
			pimPage_employeeList.retrieveCreatedEE.assertInt(PIMdata.currentEEId);
			
		}
			
}
