package OrangeHRM;

import org.testng.annotations.Test;
import core.ActionDriver;
import core.Hooks;
import core.setup;
import pages.*;
import utilities.ConfigReader;
import testData.ClaimData;
import testData.LoginData;


public class TC0002 extends Hooks {
	
	@Test(description="Verify successful add employee claims", 
			groups = {"Regression"})
	public static void VerifysuccessfulAddofClaim() throws InterruptedException
	{
		ActionDriver.WebActions.navigateToURL(ConfigReader.getStringProps("OrangeURL"));
		
		setup.LoginToOrangeHRM(LoginData.username_valid,LoginData.password_valid);
		
		homePage.tab_Claim.clickElement();
		claimPage.button_SumbitClaim.clickElement();
		claimPage_submitClaim.dropdown_Event.waitElementVisible();
		claimPage_submitClaim.dropdown_Event.clickElement();
		claimPage_submitClaim.dropdown_Listbox.waitElementVisible();
		claimPage_submitClaim.dropdown_Event_options.waitElementVisible();
		claimPage_submitClaim.dropdown_Event_options.clickElement();
		claimPage_submitClaim.dropdown_Event.clickElement();
		
		claimPage_submitClaim.dropdown_Curr.clickElement();
		claimPage_submitClaim.dropdown_Listbox.waitElementVisible();
		claimPage_submitClaim.dropdown_Curr_options.waitElementVisible();
		claimPage_submitClaim.dropdown_Curr_options.clickElement();
		claimPage_submitClaim.dropdown_Curr.clickElement();
		
		claimPage_submitClaim.field_Remark.setText(ClaimData.field_Remarks);
		claimPage_submitClaim.buttonCreateorSave.clickElement();
		claimPage.header_submitClaim.assertElementDisplayed();
		
		claimPage.button_Add.clickElement();
		claimPage_submitClaim_addExpense.Tab_addExpense.waitElementVisible();
		claimPage_submitClaim_addExpense.inputDateNow.setText();
		claimPage_submitClaim_addExpense.inputAmt.setText(ClaimData.Amount);
		claimPage_submitClaim_addExpense.dropdown_ExpenseType.clickElement();
		claimPage_submitClaim_addExpense.dropdown_expenseType_options.waitElementVisible();
		claimPage_submitClaim_addExpense.dropdown_expenseType_options.clickElement();
		claimPage_submitClaim_addExpense.buttonCreateorSave.clickElement();
		claimPage_submitClaim.assertAddedExpense.assertElementDisplayed();
		
		//assertion
		claimPage.button_Submit.waitElementVisible();
		claimPage.button_Submit.moveToElement();
		claimPage.button_Submit.clickElement();
		//claimPage.assertclaimStatus.assertText(ClaimData.expectedValue);
		claimPage.header_MyClaims.clickElement();
		Thread.sleep(5000);
		claimPage_myClaims.assertclaimStatus.assertText(ClaimData.expectedValue);
	}
	
}
