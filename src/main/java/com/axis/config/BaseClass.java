package com.axis.config;

/*import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;*/
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import com.keyword.axis.UIKeywords;

public class BaseClass {
	UIKeywords keyword = UIKeywords.getInstance();
	public static RemoteWebDriver driver = null;

	@BeforeMethod
	@Parameters("browser-name")
	public void setUp() {
		keyword.OpenBrow("Chrome");
		keyword.launchUrl("https://www.axisbank.com");
	}

	@AfterMethod
	public void tearDown() {
	//	keyword.quitBrowse();
	}
	/*Below code for cross brossing test
	 * @BeforeMethod
	@Parameters("browser-name")
	public void setup(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else {
			System.err.println("Invalid Browser Name...");
		}
		driver.manage().window().maximize();
		driver.get("https://www.axisbank.com");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();

	}*/
}
