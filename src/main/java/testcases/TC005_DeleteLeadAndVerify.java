package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadPage;
import pages.LoginPage;
import pages.ViewLeadPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLeadAndVerify extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="DeleteLead";
		testNodes="Leads";
		category="Smoke";
		authors="Balaji";
		browserName="chrome";
		dataSheetName="TC005";
	}



	@Test(dataProvider="fetchData")
	public void DeleteLeadAndVerify(String uName,String pwd,String frstLeadID,String PhoneNum,String VText) throws InterruptedException 
	{
		 
		
		ViewLeadPage flp = new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRM()
		.clickLeads()
		.clickFindLeads()
		.clickPhoneTab()
		.typePhoneNum(PhoneNum)
		.clickFindLeadButton();
		String firstLeadID = flp.getFirstLeadID(frstLeadID);
	/*	.clickFirstResult()
		.clickDeleteButton()
		.clickLeads()
		.clickFindLeads()
		.verifyDeleteLead(VText);	*/

	}

}
