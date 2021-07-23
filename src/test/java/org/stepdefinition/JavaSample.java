package org.stepdefinition;

import java.net.URL;

//Sample test in Java to run Automate session.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JavaSample {
	public static final String AUTOMATE_USERNAME = "manojkumar224";
	public static final String AUTOMATE_ACCESS_KEY = "pRTuFn1M8yEpYKqPM6sA";
	public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY
			+ "@hub-cloud.browserstack.com/wd/hub";

	public static void main(String[] args) throws Exception {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os_version", "10");
		caps.setCapability("resolution", "1920x1080");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "latest");
		caps.setCapability("os", "Windows");
		caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
		caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("https://en-gb.facebook.com/");
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("Manoj");
		WebElement element1 = driver.findElement(By.id("pass"));
		element1.sendKeys("234567");
		WebElement btnLogn = driver.findElement(By.name("login"));
		btnLogn.click();
		
		driver.quit();
	}

	
}