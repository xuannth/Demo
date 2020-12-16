package asia.twentyci.features.browser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import asia.twentyci.steps.serenity.HomeSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class WhenOpeningTheWeb {
	
	@Managed
	WebDriver driver;
	
	@Steps
	HomeSteps xuannh;
	
	@Test
	public void launch_web_application() {
		xuannh.visit_application();
	}
}
