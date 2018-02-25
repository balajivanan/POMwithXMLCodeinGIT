package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadPage extends ProjectMethods{


	public MyLeadPage() {
		PageFactory.initElements(driver,this);	
	}

	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLeads;

	public CreateLeadPage clickCreateLeads() {
		click(eleCreateLeads);
		return new CreateLeadPage();

	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeads;

	public FindLeadPage clickFindLeads() {
		click(eleFindLeads);
		return new FindLeadPage();

	}
	
	@FindBy(how=How.LINK_TEXT,using="Leads")
	private WebElement eleLeads;

	public MyLeadPage clickLeads() {
		click(eleLeads);
		return new MyLeadPage();

	}
}
