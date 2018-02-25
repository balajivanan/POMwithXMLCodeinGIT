package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{


	public CreateLeadPage() {
		PageFactory.initElements(driver,this);	
	}

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCname;

	public CreateLeadPage EnterCname(String data) {
		type(eleCname, data);
		return this;

	}
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFname;

	public CreateLeadPage EnterFname(String data) {
		type(eleFname, data);
		return this;

	}
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLname;

	public CreateLeadPage EnterLname(String data) {
		type(eleLname, data);
		return this;

	}
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement elePhneNum;

	public CreateLeadPage EnterPhneNum(String data) {
		type(elePhneNum, data);
		return this;

	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement eleEmailID;

	public CreateLeadPage EnterEmailID(String data) {
		type(eleEmailID, data);
		return this;

	}

	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleClickCreateLeads;

	public ViewLeadPage clickCreateLeads() {
		click(eleClickCreateLeads);
		return new ViewLeadPage();

	}
}

