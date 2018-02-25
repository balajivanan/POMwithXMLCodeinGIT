package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_EditLead";
		testDescription="EditLead";
		testNodes="Leads";
		category="Smoke";
		authors="Balaji";
		browserName="chrome";
		dataSheetName="TC003";
	}



	@Test(dataProvider="fetchData")
	public void EditLeadAndVerify(String uName,String pwd,String Fname,String Cname,String VCname) throws InterruptedException {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRM()
		.clickLeads()
		.clickFindLeads()
		.typeFname(Fname)
		.clickFindLeadButton()
		.clickFirstResult()
		//.verifyPageTitle()
		.clickEditButton()
		.editCompnyName(Cname)
		.clickUpdate()
		.verifyCname(Cname);

	}

}
