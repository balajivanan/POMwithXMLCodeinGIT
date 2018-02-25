package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{


	public ViewLeadPage() {
		PageFactory.initElements(driver,this);	
	}

	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleVerifyFname;

	public ViewLeadPage verifyFname(String data) {

		verifyPartialText(eleVerifyFname, data);
		return this;

	}

	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private String elePageTitle;

	public ViewLeadPage verifyPageTitle() {
		verifyTitle(elePageTitle);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleEditButton;

	public EditLeadPage clickEditButton(){
		click(eleEditButton);
		return new EditLeadPage();
	}
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleVerifyCname;

	public ViewLeadPage verifyCname(String data) {
		verifyPartialText(eleVerifyCname, data);
		return this;

	}
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eleDuplicateButton;

	public DuplicateLeadPage clickDuplicateButton(){
		click(eleDuplicateButton);
		return new DuplicateLeadPage();
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadButton;

	public ViewLeadPage clickFindLeadButton() throws InterruptedException {
		click(eleFindLeadButton);
		Thread.sleep(5000);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement eleFirstResult;

	public ViewLeadPage clickFirstResult() {
		click(eleFirstResult);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement eleDeleteButton;

	public MyLeadPage clickDeleteButton(){
		click(eleDeleteButton);
		return new MyLeadPage();
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	public WebElement eleFirstLeadIDval;

	public String getFirstLeadID(String eleFirstLeadID) {
		getText(eleFirstLeadIDval);
		return eleFirstLeadID;
	}

	
}

