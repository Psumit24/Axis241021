package com.keyword.axis;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeywords implements WebDriver {
	public RemoteWebDriver driver = null;
	private static final UIKeywords uiKeywords;
	static {
		uiKeywords = new UIKeywords();
	}

	public static UIKeywords getInstance() {
		return uiKeywords;
	}

	private UIKeywords() {
	}

	/**
	 * @param browserName This keyword use to launch specified browse
	 *                    <ul>
	 *                    <li>chrome</li>
	 *                    <li>firefox</li>
	 *                    <li>ie</li>
	 *                    <li>safari</li>
	 *                    </ul>
	 */
	public void OpenBrow(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromiumdriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else {
			System.err.println("Invalid Browser Name:" + browserName);
		}
		driver.manage().window().maximize();
	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public void click(WebElement element) {
		element.click();
	}

	public void enterText(WebElement element, String textToEnter) {
		element.sendKeys(textToEnter);

	}

	public WebElement getWebElement(String locatorType, String locatorValue) {
		WebElement element = null;
		if (locatorType.equalsIgnoreCase("css")) {
			element = driver.findElement(By.cssSelector(locatorValue));

		}
		if (locatorType.equalsIgnoreCase("xpath")) {
			element = driver.findElement(By.xpath(locatorValue));
		}
		if (locatorType.equalsIgnoreCase("id")) {
			element = driver.findElement(By.id(locatorValue));

		}
		if (locatorType.equalsIgnoreCase("class")) {
			element = driver.findElement(By.className(locatorValue));

		}
		if (locatorType.equalsIgnoreCase("tag")) {
			element = driver.findElement(By.tagName(locatorValue));
		}
		if (locatorType.equalsIgnoreCase("name")) {
			element = driver.findElement(By.name(locatorValue));
		}

		return element;
	}

	@Deprecated
	public void enterText(String locatorType, String locatorValue, String enterText) {
		getWebElement(locatorType, locatorValue).sendKeys(enterText);
	}

	public void maximazeWindow() {
		driver.manage().window().maximize();
	}

	public String getTitleOfPage() {
		return driver.getTitle();
	}

	public String getCurrentURl() {
		return driver.getCurrentUrl();
	}

	public RemoteWebDriver getDriver() {
		return driver;
	}

	public void click(String locatorType, String locatorValue) {
		getWebElement(locatorType, locatorValue).click();
	}

	public Timeouts implicitWait() {
		return driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

	}

	public void switchtoFrameAt(int index) {
		driver.switchTo().frame(index);
	}

	public void switchtoFrameAt1(String nameorId) {
		driver.switchTo().frame(nameorId);
	}

	public void switchtoFrameAt2(WebElement frame) {
		driver.switchTo().frame(frame);
	}

	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowse() {
		driver.quit();
	}

	public void enterText(String object, String textToEnter) {
		String[] parts = object.split("##");
		getWebElement(parts[0], parts[1]).sendKeys(textToEnter);

	}

	public String getTextonSubmit(WebElement element) {
		return ((WebElement) element).getText();
	}
public void m1() {
JavascriptExecutor jsd = driver;
jsd.executeScript("window.scrollBy(arguments[0],arguments[1])", 0, 4000);
System.out.println("Hello Java");
}

@Override
public void get(String url) {
	// TODO Auto-generated method stub
	
}

@Override
public String getCurrentUrl() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getTitle() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<WebElement> findElements(By by) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public WebElement findElement(By by) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getPageSource() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void close() {
	// TODO Auto-generated method stub
	
}

@Override
public void quit() {
	// TODO Auto-generated method stub
	
}

@Override
public Set<String> getWindowHandles() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getWindowHandle() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public TargetLocator switchTo() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Navigation navigate() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Options manage() {
	// TODO Auto-generated method stub
	return null;
}
	
	
}
