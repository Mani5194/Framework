package StepDefinition;

import org.openqa.selenium.WebDriver;

import Base.BaseClass;
import Pom.GooglePage;
import Pom.LoginPage;
import TestRunner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefenition extends BaseClass {
	public WebDriver driver = TestRunner.driver;
	LoginPage lp = new LoginPage(driver);
	GooglePage gp = new GooglePage(driver);

	@Given("User able to launch googlepage")
	public void user_able_to_launch_googlepage() throws Throwable {
		
	}

	@When("User enter the username {string} in 	loginpage")
	public void user_enter_the_username_in_loginpage(String string) {
		elementToBeClicked(gp.getGmail());
		elementToBeClicked(lp.signIn());
		dataPassing(lp.userName(), string);
	}

	@When("User click the Login button")
	public void user_click_the_login_button() {

		elementToBeClicked(lp.logIn());
	}

}