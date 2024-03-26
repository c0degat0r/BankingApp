package utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {

	public static WebDriver driver;
	public static Select sel;
	
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--headless");  //option in chromeDriver below
		
		driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	}
	

	public static void enterDate(String field, String monthValue, String yearValue, String dateValue) {		
	driver.findElement(By.id(field)).click();
	WebElement month = driver.findElement(By.id("calMonthPicker"));
	sel = new Select(month);
	sel.selectByVisibleText(monthValue);
	WebElement year = driver.findElement(By.id("calYearPicker"));
	sel = new Select(year);
	sel.selectByVisibleText(yearValue);

	List<WebElement> weekdays = driver
			.findElements(By.xpath("//tr[@class ='calRow']//td[@class ='weekday'or @class ='weekend']"));

	for (WebElement day : weekdays) {
		String date = day.getText();
		if (date.equalsIgnoreCase(dateValue)) {
			day.click();
			break;
}
	}
	driver.quit();
	
	}
}
