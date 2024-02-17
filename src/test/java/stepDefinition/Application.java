package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import utilities.Base;

public class Application extends Base {

	@Then("I verify the Application on the home page")
	public void i_verify_the_application_on_the_home_page() {
	boolean pre=driver.findElement(By.xpath("//a[@title='Applications Tab - Selected']")).isDisplayed();
	Assert.assertTrue(pre);

	}

	@Then("I click on new button")
	public void i_click_on_button() {
		driver.findElement(By.name("new")).click();
	}

	

	@Then("I verify the first name field is required field")
	public void i_verify_the_first_name_field_is_required_field() {
		driver.findElement(By.xpath("//td[@class ='labelCol requiredInput']"));

	}
	

	@Then("I enter some text that id {string} to the field to verify length no more than {string}")
	public void i_enter_some_text_that_id_to_the_field_to_verify_length_no_more_than(String string, String string2) {
	    driver.findElement(By.id(string)).sendKeys(string2);

	}




	@Then("I click on the save button")
	public void i_click_on_the_save_button() {
		driver.findElement(By.name("save")).click();
	}
	}
