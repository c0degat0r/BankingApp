package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {

	public WebDriver driver;

	public void openBrowser() {
		System.out.println(">>>>"+System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");

//		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	}
}
