package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_CreateLeadAndVerify extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC002_CreateLeadAndVerify";
		testDescription="CreateLead & Verify Fname";
		testNodes="Leads";
		category="Smoke";
		authors="Balaji";
		browserName="chrome";
		dataSheetName="TC002";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void CreateLeadAndVerify(String uName,String pwd,String Cname,String Fname,String Lname,String PhneNum,String EmailID,String Vfname) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRM()
		.clickLeads()
		.clickCreateLeads()	
		.EnterCname(Cname)
		.EnterFname(Fname)
		.EnterLname(Lname)
		.EnterPhneNum(PhneNum)
		.EnterEmailID(EmailID)
		.clickCreateLeads()
		.verifyFname(Vfname);
		
	}

}
