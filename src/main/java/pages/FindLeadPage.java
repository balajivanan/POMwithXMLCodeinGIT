package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods{


	public FindLeadPage() {
		PageFactory.initElements(driver,this);	
	}

	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFname;

	public FindLeadPage typeFname(String data) {
		type(eleFname, data);
		return this;
	}

	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadButton;

	public FindLeadPage clickFindLeadButton() throws InterruptedException {
		click(eleFindLeadButton);
		Thread.sleep(5000);
		return this;
	}

	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement eleFirstResult;

	public ViewLeadPage clickFirstResult() {
		click(eleFirstResult);
		return new ViewLeadPage();
	}

	@FindBy(how=How.LINK_TEXT,using="Email")
	private WebElement eleEmailTab;

	public FindLeadPage clickEmailTab() {
		click(eleEmailTab);
		return this;
	}

	@FindBy(how=How.NAME,using="emailAddress")
	private WebElement eleEmailID;

	public ViewLeadPage typeEmailID(String data) {
		type(eleEmailID, data);
		return new ViewLeadPage();
	}

	@FindBy(how=How.LINK_TEXT,using="Phone")
	private WebElement elePhoneTab;

	public FindLeadPage clickPhoneTab() {
		click(elePhoneTab);
		return this;
	}

	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	private WebElement elephoneNum;

	public ViewLeadPage typePhoneNum(String data) {
		type(elephoneNum, data);
		return new ViewLeadPage();
	}



	@FindBy(how=How.NAME,using="id")
	public WebElement eleLeadID;


	@FindBy(how=How.CLASS_NAME,using="x-paging-info")
	private WebElement eleErrorMsgDisplay;

	public FindLeadPage verifyDeleteLead(String data)  {

		verifyExactText(eleErrorMsgDisplay, data);
		return this;
	}
	

}




