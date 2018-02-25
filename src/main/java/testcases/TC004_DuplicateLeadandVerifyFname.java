package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_DuplicateLeadandVerifyFname extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_DuplicateLead";
		testDescription="DuplicateLead";
		testNodes="Leads";
		category="Smoke";
		authors="Balaji";
		browserName="chrome";
		dataSheetName="TC004";
	}



	@Test(dataProvider="fetchData")
	public void DuplicateLeadAndVerify(String uName,String pwd,String EmailID,String Fname,String VFname) throws InterruptedException {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRM()
		.clickLeads()
		.clickFindLeads()
		.clickEmailTab()
		.typeEmailID(EmailID)
		.clickFindLeadButton()
		.clickFirstResult() 
		.clickDuplicateButton()
		.typeFname(Fname)
		.clickCreateLeadButton()
		.verifyFname(VFname);
	

	}

}
