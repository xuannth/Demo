package asia.twentyci.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject{
	
	@FindBy(xpath = "//select[@name='title']")
	WebElementFacade titleField;
	public void selectTitle() {
		titleField.select();
	}
}
