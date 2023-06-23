package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

public class LoginStepDefs {
	
	WebDriver driver = Hooks.driver;
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("https://www.saucedemo.com/");
	    Thread.sleep(3000);
	}

	@When("I enter username")
	public void i_enter_username() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName  = driver.findElement(By.id("user-name"));
		UserName .sendKeys("standard_user");
	}

	@When("I enter password")
	public void i_enter_password() {
	    // Write code here that turns the phrase above into concrete actions
	   WebElement Pwd = driver.findElement(By.id("password"));
	   Pwd.sendKeys("secret_sauce");
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	  WebElement loginBtn = driver.findElement(By.name("login-button"));
	  loginBtn.click();
	}

	@Then("I should land on home page")
	public void i_should_land_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@When("I enter username as {string}")
	public void i_enter_username_as(String UserNameVal) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName  = driver.findElement(By.id("user-name"));
		UserName .sendKeys(UserNameVal);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String PassVal) {
	    // Write code here that turns the phrase above into concrete actions
	   WebElement Pwd = driver.findElement(By.id("password"));
	   Pwd.sendKeys(PassVal);
	}
	
	@Then("I should get error message as {string}")
	public void i_should_get_error_message_as(String ExpError) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement error = driver.findElement(By.xpath("//*[@data-test='error']"));
		String ActError = error.getText();
		Assert.assertEquals(ActError, ExpError);
	}
}
