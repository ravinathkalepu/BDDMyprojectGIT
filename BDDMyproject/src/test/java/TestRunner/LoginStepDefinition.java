package TestRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	WebDriver driver=null;

@Given("^I am on Yahoo home page$")
public void i_am_on_Yahoo_home_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	System.out.println("Ravi: I am on Yahoo home page");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://ca.yahoo.com/");
	
}

@When("^I click on signin button$")
public void i_click_on_signin_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	System.out.println("Ravi: I click on signin button");
}

@When("^I enter <username> and <password>$")
public void i_enter_username_and_password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	System.out.println("Ravi: I enter <username> and <password>");
}

@When("^Click on signin button$")
public void click_on_signin_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^my mail page should be displayed\\.$")
public void my_mail_page_should_be_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}


}
