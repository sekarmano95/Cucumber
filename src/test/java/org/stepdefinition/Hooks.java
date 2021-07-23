package org.stepdefinition;

import java.io.IOException;
import java.net.MalformedURLException;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	@Before
	public void beforeScenario1() throws MalformedURLException {
		System.out.println("Before Scenario1");
		launchBrowser("Chrome");
//		browserStackBroswerLaunch();
		launchUrl("https://en-gb.facebook.com/");
		implicitWait(20);
	}

	@After
	public void afterScenario1(Scenario sc) throws IOException {
		System.out.println("After Scenario1");
		if(sc.isFailed()) {
		TakesScreenshot tk= (TakesScreenshot)driver;
		byte[] b = tk.getScreenshotAs(OutputType.BYTES);
		sc.embed(b, "image/png");
		}
		
		browserquit();
	}
	

}
