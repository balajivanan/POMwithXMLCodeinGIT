package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods{


	public DuplicateLeadPage() {
		PageFactory.initElements(driver,this);	
	}

	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eletypeFname;

	public DuplicateLeadPage typeFname(String data) {
		type(eletypeFname, data);
		return this;

	}
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleCreateLeadButton;

	public ViewLeadPage clickCreateLeadButton() {
		click(eleCreateLeadButton);
		return new ViewLeadPage();

	}


}

