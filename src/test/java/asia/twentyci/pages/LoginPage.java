package asia.twentyci.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject{

	private static final String FIRST_NAME = "//input[@type='text'][@name='first_name']";
	private static final String LAST_NAME = "//input[@type='text'][@name='last_name']";
	private static final String COMPANY = "//input[@type='text'][@name='company']";
	private static final String EMAIL_REGISTER = "//input[@type='email'][@id='email']";
	private static final String PW_REGISTER = "//input[@type='password'][@id='encrypted_password']";
	private static final String PW_CONFIRM_REGISTER =  "//input[@type='password'][@id='encrypted_password_confirmation']";
	
	@FindBy(xpath = "//select[@name='title']")
	WebElementFacade titleField;
	public void selectTitle() {
		titleField.onChange();
	}
	
	@FindBy(xpath = "//select[@name='title']")
	WebElementFacade titleField;
	
	public void selectOptionIntoTitle(String title) {
		titleField.type(title);
	}
	
	public void enterTextIntoFirstName(String firstName) {
		$(FIRST_NAME).type(firstName);
	}
	
	public void enterTextIntoLastName(String lastName) {
		$(LAST_NAME).type(lastName);
	}
	
	public void enterTextIntoCompany(String company) {
		$(COMPANY).type(company);
	}
	
	public void enterTextIntoEmail(String emailAddress) {
		$(EMAIL_REGISTER).type(emailAddress);
	}
		
	public void enterTextIntoPassword(String pwRegister) {
		$(PW_REGISTER).type(pwRegister);
	}
	
	public void enterTextIntoPasswordConfirm(String pwConfirm) {
		$(PW_CONFIRM_REGISTER).type(pwConfirm);
	}
	
	@FindBy(xpath = "//input[@type='checkbox'][@id='terms_of_service']")
	WebElementFacade termCondition;
	public void checkTermCondition() {
		termCondition.checked();
	}
	
	@FindBy(xpath = "//input[@type='submit'][@name='commit']")
	WebElementFacade submitbtn;
	public void submitForm() {
		submitbtn.submit();
	}
}
