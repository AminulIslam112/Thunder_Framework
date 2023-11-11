package AdvanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class switchWindowByTitle {

	public static void main(String[] args) {

		WebDriver Driver;
		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver();
		Driver.get("https://the-internet.herokuapp.com/windows");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement clickHereLink = Driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));

		clickHereLink.click();
		windowByTitle(Driver, "New Window");
	}

	public static void windowByTitle(WebDriver Driver, String title) {

		String currentWindow = Driver.getWindowHandle();

		for (String windowName : Driver.getWindowHandles()) {
			
			System.out.println(windowName);
			System.out.println(Driver.switchTo().window(windowName).getTitle().equals(title));
			if (!Driver.switchTo().window(windowName).getTitle().equals(title)) {
				Driver.switchTo().window(currentWindow);
			}
		}

	}

}
