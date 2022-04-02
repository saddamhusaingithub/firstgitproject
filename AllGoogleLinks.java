package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class AllGoogleLinks {
	WebDriver driver;

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am inside beforeMethod");

		String browser;
		System.setProperty("webdriver.chrome.driver", "test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void printAllGoogleLinkswithTheirHref() {
		driver.get("http://www.google.com");
		List<WebElement> allGoogleLinks = driver.findElements(By.tagName("a"));

		for (WebElement element : allGoogleLinks) {
			System.out.println(element.getText() + " - " + element.getAttribute("href"));
		}
		
		for (int i = 0; i < allGoogleLinks.size();i++) {
			System.out.println(allGoogleLinks.get(i).getText() + " - " + allGoogleLinks.get(i).getAttribute("href"));
		}
		
		
	}

}
