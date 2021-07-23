package org.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static final String AUTOMATE_USERNAME = "manojkumar224";
	public static final String AUTOMATE_ACCESS_KEY = "pRTuFn1M8yEpYKqPM6sA";
	public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY
			+ "@hub-cloud.browserstack.com/wd/hub";
	public void browserStackBroswerLaunch() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os_version", "10");
		caps.setCapability("resolution", "1920x1080");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "latest");
		caps.setCapability("os", "Windows");
		caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
		caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
		 driver = new RemoteWebDriver(new URL(URL), caps);

	}
	public void launchBrowser(String browser) {
		switch (browser) {
		case "Chrome":
			WebDriverManager.chromedriver().version("91").setup();
			driver = new ChromeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Invalid browser Name");
		}
		
	}
	public void implicitWait(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

	}
	public void launchUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	public void fillTextBox(WebElement e, String value) {
		e.sendKeys(value);
	}
	public void btnClick(WebElement e) {
		e.click();
	}
	public void browserquit() {
		driver.quit();
	}
}
