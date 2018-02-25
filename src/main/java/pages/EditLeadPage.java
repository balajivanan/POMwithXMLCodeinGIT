package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{


	public EditLeadPage() {
		PageFactory.initElements(driver,this);	
	}

	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private String elePageTitle;

	public EditLeadPage verifyPageTitle(){
		verifyTitle(elePageTitle);
		return this;
	}

	@FindBy(how=How.CLASS_NAME,using="inputBox")
	private WebElement eleCname;

	public EditLeadPage editCompnyName (String data) {
		type(eleCname, data);
		return this;
	}

	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleClickUpdate;

	public ViewLeadPage clickUpdate () {
		click(eleClickUpdate);
		return new ViewLeadPage();
	}

}

