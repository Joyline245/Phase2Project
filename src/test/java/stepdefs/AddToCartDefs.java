package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

public class AddToCartDefs {
	
	WebDriver driver = Hooks.driver;
	
	@When("I clcik on product {string}")
	public void i_clcik_on_product(String string) throws InterruptedException {

		WebElement productName = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		productName.click();
		Thread.sleep(3000);
	}

	@When("I click on add to cart")
	public void i_click_on_add_to_cart() throws InterruptedException {

		WebElement addToCartButton = driver.findElement(By.xpath("//button[text()='Add to cart']"));
		addToCartButton.click();
		Thread.sleep(3000);
	}
	
	@When("I click on Shopping cart link")
	public void i_click_on_Shopping_cart_link() throws InterruptedException {

		WebElement ShoppingCart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		ShoppingCart.click();
		Thread.sleep(3000);
	}
	
	@Then("I should be able to see the item as {string}")
	public void i_should_be_able_to_see_the_item_as(String ExpProduct) {
		WebElement item = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
		String ActualProduct = item.getText();
		Assert.assertEquals(ExpProduct, ActualProduct);
		System.out.println("The Actual product name is "+ActualProduct);
	}
}
