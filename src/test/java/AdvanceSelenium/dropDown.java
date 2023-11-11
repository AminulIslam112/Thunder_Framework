package AdvanceSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {
	static WebDriver Driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver();
		Driver.get("https://the-internet.herokuapp.com/dropdown");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement dropDown = Driver.findElement(By.xpath("//select[@ id='dropdown'] "));
		Select s = new Select(dropDown);
		//s.selectByIndex(1);

		 //s.selectByValue("2");

		 //s.selectByVisibleText("Option 2");
		List<WebElement>allOptions = s.getOptions();
		for(int i =0; i<allOptions.size(); i++) {
			System.out.println(allOptions.get(i).getText());
		}
		
		Thread.sleep(5000);
		
		Driver.quit();
		
		
		
	}
}
