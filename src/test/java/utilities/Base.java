package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
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
//		option.addArguments("--headless");  //option in chromeDriver below
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	}
}
