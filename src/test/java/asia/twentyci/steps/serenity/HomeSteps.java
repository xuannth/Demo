package asia.twentyci.steps.serenity;

import asia.twentyci.pages.HomePage;
import asia.twentyci.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class HomeSteps {
	HomePage onHomepage;
	LoginPage onLoginpage;
	@Step
	public void visit_application() {
		onHomepage.open();
		onHomepage.clickOnLoginLink();
		onLoginpage.selectTitle();
	}
}