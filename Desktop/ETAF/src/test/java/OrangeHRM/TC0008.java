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


public class TC0008 extends Hooks {
	
	@Test(description="Add employee via data import", 
			groups = {"Regression"})
	public static void VerifyAddEEViaDataImport() throws InterruptedException
	{
		Utility.inputDatainFile(1,0,"eeFN");
		Utility.inputDatainFile(1,1,"eeMN");
		Utility.inputDatainFile(1,2,"eeLN");
		Utility.inputDatainFile(1,3,"eeID");
		
		ActionDriver.WebActions.navigateToURL(ConfigReader.getStringProps("OrangeURL"));
		setup.LoginToOrangeHRM(LoginData.username_valid,LoginData.password_valid);
		homePage.tab_PIM.waitElementVisible();
		homePage.tab_PIM.clickElement();
		
		pimPage.tab_Configuration.waitElementVisible();
		pimPage.tab_Configuration.clickElement();
		pimPage.tab_Configuration_options.waitElementVisible();
		pimPage.tab_Configuration_options.clickElement();
		
		//.link_Download.waitElementVisible();
		//pimPage_Configuration.link_Download.clickElement();
		
		//pimPage_Configuration.btn_browse.waitElementVisible();
		//pimPage_Configuration.btn_browse.clickElement();
		//pimPage_Configuration.field_inputPathtoUploadData.waitElementVisible();
		pimPage_Configuration.field_inputPathtoUploadData.setText(PIMdata.pathToUploadData);
		//pimPage_Configuration.btn_Open.clickElement();
		pimPage_Configuration.buttonCreateorSave.waitElementVisible();
		pimPage_Configuration.buttonCreateorSave.clickElement();
		Thread.sleep(2000);
		pimPage_Configuration.Message_SuccessfulImport.assertElementDisplayed();
		
		
	
	}
	
}
