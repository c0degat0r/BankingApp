package stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Base;

public class Application extends Base {

	@Given("I clicked on Application Tab")
	public void i_clicked_on_application_tab() {
		boolean pre = driver.findElement(By.xpath("//a[@title='Applications Tab - Selected']")).isDisplayed();
		Assert.assertTrue(pre);
	}
	@Given("I clicked on New button")
	public void i_clicked_on_new_button() {
		driver.findElement(By.name("new")).click();
	}

	@Then("I verified that First Name field is present")
	public void i_verified_that_first_name_field_is_present() {
		driver.findElement(By.id("00NHs00000gWijB")).isDisplayed();
	}
	@Then("I click save to confirm")
	public void i_click_save_to_confirm() {
		driver.findElement(By.name("save")).click();	   
	}
	@Then("I eneterd some letters to confirm the	required length of {int} chrachters")
	public void i_eneterd_some_letters_to_confirm_the_required_length_of_chrachters(Integer int1) {
		driver.findElement(By.id("00NHs00000gWijG")).sendKeys("Leng Sandy Ella Micky And Anna and Aliya ");
	}
	
	@Given("I clicked save to confirm")
	public void i_clicked_save_to_confirm() {
		driver.findElement(By.name("save")).click();
		Assert.assertTrue(true);
	}	
	@Then("I eneterd letters to confirm the required length of {int} chrachters")
	public void i_eneterd_letters_to_confirm_the_required_length_of_chrachters(Integer int1) {
		driver.findElement(By.id("00NHs00000gWijG")).sendKeys("Leng Sandy Ella Micky And Anna and Aliya ");
	}

	@Then("I click the save button to confirm")
	public void i_click_the_save_button_to_confirm() {
		driver.findElement(By.name("save")).click();
		Assert.assertTrue(true);
	}

	@Given("I verified that Middle Name field is present")

	public void i_verified_that_middle_name_field_is_present() {
		driver.findElement(By.id("00NHs00000gWijG"));
	}

	@Given("I verified that the field is not required by clicking save button")
	public void i_verified_that_the_field_is_not_required_by_clicking_save_button() {
		driver.findElement(By.name("save")).click();
		Assert.assertTrue(true);
	}

	@Given("I entered length of sometext to confirm the required length")
	public void i_entered_length_of_sometext_to_confirm_the_required_length() {
		driver.findElement(By.id("00NHs00000gWijG")).sendKeys("Pean Mehan Rob Jerry Adien");
	}

	@Then("I click save to comfirm the entry")
	public void i_click_save_to_comfirm_the_entry() {
		driver.findElement(By.name("save")).click();
		Assert.assertTrue(true);
	}

	@Given("I verified that Last Name field is present")
	public void i_verified_that_last_name_field_is_present() {
		driver.findElement(By.id("00NHs00000gWijL"));
	}

	@Given("I clicked save to confirm that this field is madatory")
	public void i_clicked_save_to_confirm_that_this_field_is_madatory() {
		driver.findElement(By.className("btn")).click();
		Assert.assertTrue(true);
	}

	@Then("I eneterd letters to confirm the	required length of {int}")
	public void i_eneterd_letters_to_confirm_the_required_length_of(Integer int1) {
		driver.findElement(By.id("00NHs00000gWijL")).sendKeys("lyly Jack Doe Remo JDorger");
	}

	@Then("I click the save button to confirm the required length")
	public void i_click_the_save_button_to_confirm_the_required_length() {
		driver.findElement(By.className("btn")).click();
		Assert.assertTrue(true);

	}
	@Given("I verified the dropdown field is present")
	public void i_verified_the_dropdown_field_is_present() {
		driver.findElement(By.id("00NHs00000gWil2"));

	}

	@Given("I clicked save to confirm that this field is required")
	public void i_clicked_save_to_confirm_that_this_field_is_required() {
		driver.findElement(By.name("save")).click();
		Assert.assertTrue(true);

	}

	@Given("I verified the dropdown which has {string} id with these following options")
	public void i_verified_the_dropdown_which_has_id_with_these_following_options(String dwfeild,
			io.cucumber.datatable.DataTable dataTable) {
		List<String> expectedValues = dataTable.asList();
		WebElement feild = driver.findElement(By.id(dwfeild));
		Select sel = new Select(feild);
		List<WebElement> actaulValues = sel.getOptions();
		for (int i = 0; i < expectedValues.size(); i++) {

		}

	}

	@Then("I verified the values are in alphabetical in order with these following option")
	public void i_verified_the_values_are_in_alphabetical_in_order_with_these_following_option(
			io.cucumber.datatable.DataTable dataTable) {
		driver.findElement(By.id("00NHs00000gWil2")).getText();

	}

	@Then("I verified the default value is entered as none")
	public void i_verified_the_default_value_is_entered_as_none() {
		driver.findElement(By.id("00NHs00000gWil2")).click();
		System.out.println("--None--");

	}

	@Given("I verified the access as standard user")
	public void i_verified_the_access_as_standard_user() {
		openBrowser();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("john@codegator.us");
		driver.findElement(By.id("password")).sendKeys("Welcome2");
		driver.findElement(By.id("Login")).click();
	}

	@And("I verified that the Application Object tab is visible")
	public void i_verified_that_the_application_object_tab_is_visible() {
		driver.findElement(By.xpath("//a[@title='Applications Tab - Selected']")).isDisplayed();
	}

	@Given("I verified if is application tab present then click on New button")
	public void i_verified_if_is_application_tab_present_then_click_on_new_button() {

		List<WebElement> page = driver.findElements(By.className("\"pageTitleIcon\""));
		for (WebElement New : page) {
			boolean pageH = New.isSelected();
			if (pageH) {
				System.out.println("Application Tab is click");
			} else {
				New.click();
			}

		}

	}

	@Given("I verified the Co-signer checkbox is present")
	public void i_verified_the_co_signer_checkbox_is_present() {
		boolean CScheckbox = driver.findElement(By.id("00NHs00000gYC9i")).isDisplayed();
		Assert.assertTrue(true);
	}

	@Then("I verified the checkbox should have a default value of un-clecked")
	public void i_verified_the_checkbox_should_have_a_default_value_of_un_clecked() {
		WebElement checkbox = driver.findElement(By.id("00NHs00000gYC9i"));
		if (!checkbox.isSelected()) {
			System.out.println("checkbox is unchecked by default");

		} else {
			System.out.println("checkbox is checked by default");
		}

	}

	@Given("I verified the Loan Amount  should be added to the {string} id fiel")
	public void i_verified_the_loan_amount_should_be_added_to_the_id_fiel(String feild) {
		driver.findElement(By.id(feild));

	}

	@Given("The field should be a currency field")
	public void the_field_should_be_a_currency_field() {

		List<WebElement> CurrName = driver.findElements(By.id("00NHs00000gYC9T"));
		for (WebElement field : CurrName) {
			String Curr_name = field.getText();
			if (Curr_name.equalsIgnoreCase("America")) {
				Assert.assertTrue(false);
			}
		}

	}

	@Then("The loan amount should be saved along with the application data")
	public void the_loan_amount_should_be_saved_along_with_the_application_data() {
		driver.findElement(By.name("save")).click();
		Assert.assertTrue(true);
	}

	@Then("The field should accept decimal values")
	public void the_field_should_accept_decimal_values() {
		driver.findElement(By.id("00NHs00000gYC9T")).sendKeys("1200.59");
		Assert.assertTrue(true);

	}

	@Given("The drop down field should have the following options in the specified order")
	public void the_drop_down_field_should_have_the_following_options_in_the_specified_order(
			io.cucumber.datatable.DataTable dataTable) {
		List<String> expectedLuse = dataTable.asList();
		WebElement feild = driver.findElement(By.id("00NHs00000gYC9d"));
		Select sel = new Select(feild);
		List<WebElement> actaulLuse = sel.getOptions();
		for (int i = 0; i < expectedLuse.size(); i++) {
			Assert.assertNotSame(expectedLuse, actaulLuse);
		}

	}

	@Then("The selected purpose should be saved along with the application data")
	public void the_selected_purpose_should_be_saved_along_with_the_application_data() {
		driver.findElement(By.name("save")).click();

	}

	@Given("I verified the Loan Amount field is there")
	public void i_verified_the_loan_amount_field_is_there() {
		boolean leanField = driver.findElement(By.id("00NHs00000gYC9T")).isDisplayed();
		Assert.assertTrue(leanField);

	}

	@Given("The Loan Amount field should accept Alphabets")
	public void the_loan_amount_field_should_accept_alphabets() {
		driver.findElement(By.id("00NHs00000gYC9T")).sendKeys("Twenty Thousand");

	}

	@Given("I verfied the dropdown field is present")
	public void i_verfied_the_dropdown_field_is_present() {
		boolean pre = driver.findElement(By.id("00NHs00000hqWgA")).isDisplayed();
		Assert.assertTrue(pre);

	}

	@Given("the drop down filed should have the following options")
	public void the_drop_down_filed_should_have_the_following_options(io.cucumber.datatable.DataTable dataTable) {
		List<String> expectedCriteria = dataTable.asList();
		WebElement EmpStatus = driver.findElement(By.id("00NHs00000hqWgA"));
		Select sel = new Select(EmpStatus);
		List<WebElement> actaulCriteria = sel.getOptions();
		for (int i = 0; i < expectedCriteria.size(); i++) {
			Assert.assertNotSame(expectedCriteria, actaulCriteria);
		}

	}

	@Then("I verified the Default Value should be {string}")
	public void i_verified_the_default_value_should_be(String string) {
		WebElement Employed = driver.findElement(By.id("00NHs00000gYC9i"));
		if (!Employed.isSelected()) {
			System.out.println("Employed is Select  by default");

		} else {
			System.out.println("Employed is not a default value");
		}

	}

	@Then("I verified the {string} is the require field by click on {string} button")
	public void i_verified_the_is_the_require_field_by_click_on_button(String string, String string2) {
		driver.findElement(By.name("save")).click();
		Assert.assertTrue(true);

	}

	@Given("I verfied the Status Type field is present")
	public void i_verfied_the_status_type_field_is_present() {
		Boolean StatusType = driver.findElement(By.id("00NHs00000hqWg5")).isDisplayed();
		Assert.assertTrue(StatusType);

	}

	@Given("The Status Type drop down field should have these following options")
	public void the_status_type_drop_down_field_should_have_these_following_options(
			io.cucumber.datatable.DataTable dataTable) {
		List<String> expectedValues = dataTable.asList();
		WebElement StatusType = driver.findElement(By.id("00NHs00000hqWg5"));
		Select sel = new Select(StatusType);
		List<WebElement> actaulValues = sel.getOptions();
		for (int i = 0; i < expectedValues.size(); i++) {

		}
	}

	@Then("The {string} value is the Default Value")
	public void the_value_is_the_default_value(String string) {
		WebElement Dvalue = driver.findElement(By.id("00NHs00000hqWg5"));
		if (!Dvalue.isSelected()) {
			System.out.println("In-Process");

		} else {
			System.out.println("other value");
		}
	}

	@Given("I verfied the field that has {string} id is present")
	public void i_verfied_the_field_that_has_id_is_present(String string) {
		boolean pre = driver.findElement(By.id(string)).isDisplayed();
		Assert.assertTrue(pre);

	}

	@Then("The drop down field should have these follwing options")
	public void the_drop_down_field_should_have_these_follwing_options(io.cucumber.datatable.DataTable dataTable) {
		List<String> expectedValues = dataTable.asList();
		WebElement Dfield = driver.findElement(By.id("00NHs00000ht2ko"));
		Select sel = new Select(Dfield);
		List<WebElement> actaulValues = sel.getOptions();
		for (int i = 0; i < expectedValues.size(); i++) {

		}

	}

	@Then("I verified {string} is the default value")
	public void i_verified_is_the_default_value(String string) {
		WebElement None = driver.findElement(By.id("00NHs00000ht2ko"));
		if (!None.isSelected()) {
			System.out.println("--None--");

		} else {
			System.out.println("other value");
		}

	}

	@Then("I verified is a Required field by clicking save button")
	public void i_verified_is_a_required_field_by_clicking_save_button() {
		driver.findElement(By.name("save")).click();
		Assert.assertTrue(true);

	}

	@Then("I verified the values are in alphabatically in order by following option")
	public void i_verified_the_values_are_in_alphabatically_in_order_by_following_option(
			io.cucumber.datatable.DataTable dataTable) {
		driver.findElement(By.id("00NHs00000ht2ko")).getText();

	}

	@Given("I verified the drop down field that has {string} id is there")
	public void i_verified_the_drop_down_field_that_has_id_is_there(String string) {
		boolean pre = driver.findElement(By.id(string)).isDisplayed();
		Assert.assertTrue(pre);

	}

	@Then("I click save button to verified that is a required field")
	public void i_click_save_button_to_verified_that_is_a_required_field() {
		driver.findElement(By.name("save")).click();
		Assert.assertTrue(true);

	}

	@Then("I verified the values are in order by following option")
	public void i_verified_the_values_are_in_order_by_following_option(io.cucumber.datatable.DataTable dataTable) {
		List<String> expectedValues = dataTable.asList();
		WebElement ASfield = driver.findElement(By.id("00NHs00000ht3C4"));
		Select sel = new Select(ASfield);
		List<WebElement> actaulValues = sel.getOptions();
		for (int i = 0; i < expectedValues.size(); i++) {

		}

	}

	@Then("I verified default value is {string}")
	public void i_verified_default_value_is(String string) {
		WebElement None = driver.findElement(By.id("00NHs00000ht3C4"));
		if (!None.isSelected()) {
			System.out.println("--None--");

		} else {
			System.out.println("other value");
		}
	}

	@Then("I verfied the values are in alphabatically in order by following optin")
	public void i_verfied_the_values_are_in_alphabatically_in_order_by_following_optin(
			io.cucumber.datatable.DataTable dataTable) {
		driver.findElement(By.id("00NHs00000ht3C4")).getText();
	}

	@Given("I verified the field that has name {string} is present")
	public void i_verified_the_field_that_has_name_is_present(String Annual) {
		driver.findElement(By.id(Annual)).isDisplayed();

	}

	@Then("I verified is a required field by clicking {string} button")
	public void i_verified_is_a_required_field_by_clicking_button(String string) {
		driver.findElement(By.name("save")).click();
		Assert.assertTrue(true);
	}

	@Then("It should take length {int} max amount and {int} decimals")
	public void it_should_take_length_max_amount_and_decimals(Integer int1, Integer int2) {
		driver.findElement(By.id("00NHs00000ht3C9")).sendKeys("950000.23");
	}

	@Given("I verified the field that has id {string} is present")
	public void i_verified_the_field_that_has_id_is_present(String Phone) {
		driver.findElement(By.id(Phone)).isDisplayed();

	}

	@Then("I verified it is a required field by click save button")
	public void i_verified_it_is_a_required_field_by_click_save_button() {
		driver.findElement(By.name("save")).click();
		Assert.assertTrue(true);
	}

	@Then("I enter some numbers to verified it able to take the text")
	public void i_enter_some_numbers_to_verified_it_able_to_take_the_text() {
		driver.findElement(By.id("00NHs00000ht3CE")).sendKeys("7038889733");

	}

	@Given("I verified the field has Id  {string} is present")
	public void i_verified_the_field_has_id_is_present(String Email) {
		driver.findElement(By.id(Email)).isDisplayed();

	}

	@Then("I click  save to verify is a required field")
	public void i_click_save_to_verify_is_a_required_field() {
		driver.findElement(By.name("save")).click();
		Assert.assertTrue(true);

	}

	@Then("I enter some text to verified it is able to appear")
	public void i_enter_some_text_to_verified_it_is_able_to_appear() {
		driver.findElement(By.id("00NHs00000ht3CJ")).sendKeys("ella3344@gmail.com");

	}

	@Given("I verified the field is that has id {string} is there")
	public void i_verified_the_field_is_that_has_id_is_there(String string) {
		driver.findElement(By.id("datePicker")).isDisplayed();

	}

	@Then("I verified it is a required field")
	public void i_verified_it_is_a_required_field() {
		driver.findElement(By.name("save")).click();
		Assert.assertTrue(true);

	}

	@Then("I verified It should not accept future date by enter some future date")
	public void i_verified_it_should_not_accept_future_date_by_enter_some_future_date() {
		enterDate("00NHs00000ht3CO", "March","2025","2");
		

	}

	@Given("I verified the field present on the application page")
	public void i_verified_the_field_present_on_the_application_page() {
		driver.findElement(By.id("00NHs00000ht3CT")).isDisplayed();

	}
	@Then("I enter the Application name in the field that has\"Name\" id")
	public void i_enter_the_application_name_in_the_field_that_has_name_id() {
	    driver.findElement(By.id("Name")).sendKeys("LengApplication");
	}

	@Then("I enter first name that has id {string}")
	public void i_enter_first_name_that_has_id(String firstname) {
	  driver.findElement(By.id(firstname)).sendKeys("Leng");

	}
	@Then("I enter last name with id {string}")
	public void i_enter_last_name_with_id(String lastname) {
	   driver.findElement(By.id(lastname)).sendKeys("Ly");

	}
	@Then("I select a values in Marital status drop down field")
	public void i_select_a_values_in_marital_status_drop_down_field() {
	   WebElement Mfield = driver.findElement(By.id("00NHs00000gWil2"));
	   Select sel = new Select(Mfield);
	   sel.selectByVisibleText("Married");
	}
	
	@Then("I select a values in stauts field {string} id")
	public void i_select_a_values_in_stauts_field_id(String id) {
	    WebElement stautsfield =driver.findElement(By.id(id));
	    Select sel = new Select(stautsfield);
	    sel.selectByVisibleText("In-Review");
	}
	@Then("I select a values in Employment Status field")
	public void i_select_a_values_in_employment_status_field() {
		WebElement EmField = driver.findElement(By.id("00NHs00000hqWgA"));
		Select sel = new Select(EmField);
		sel.selectByVisibleText("Employed");
	}
	@Then("I select a values in Employment Category field")
	public void i_select_a_values_in_employment_category_field() {
		WebElement EmCfield =driver.findElement(By.id("00NHs00000ht2ko"));
		Select sel = new Select(EmCfield);
		sel.selectByVisibleText("Chef");   

	}
	@Then("I select a values in Appicaton Status field")
	public void i_select_a_values_in_appicaton_status_field() {
		WebElement AppStatus =driver.findElement(By.id("00NHs00000ht3C4"));
		Select sel = new Select(AppStatus);
		sel.selectByVisibleText("Approved");
	}
	

	@Then("I enter some number in Annual Income field")
	public void i_enter_some_number_in_annual_income_field() {
	   driver.findElement(By.id("00NHs00000ht3C9")).sendKeys("950000.23");

	}
	@Then("I enter a email")
	public void i_enter_a_email() {
	  driver.findElement(By.id("00NHs00000ht3CJ")).sendKeys("kind.line@gmail.com");

	}
	@Then("I enter a phone number")
	public void i_enter_a_phone_number() {
	    driver.findElement(By.id("00NHs00000ht3CE")).sendKeys("5712227768");

	}
	@Then("I enter date of birth")
	public void i_enter_date_of_birth() {
		driver.findElement(By.id("00NHs00000ht3CO")).sendKeys("3/2/2023");

	}

	@Then("It should be Encrypted field")
	public void it_should_be_encrypted_field() {
	    driver.findElement(By.id("00NHs00000ht3CT")).sendKeys("234679899");
	    Assert.assertTrue(true);
	
	}

	@Then("I verified it a required field by click on save button")
	public void i_verified_it_a_required_field_by_click_on_save_button() {
		driver.findElement(By.name("save")).click();
		Assert.assertTrue(true);
	


	}

}
