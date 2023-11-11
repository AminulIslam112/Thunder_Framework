package AdvanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragandDrop {

	public static void main(String[] args) {

		
		WebDriver Driver;
		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver();
		Driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement cloA = Driver.findElement(By.xpath("(//div[@id='column-a'])"));
		
		WebElement cloB = Driver.findElement(By.xpath("(//div[@id='column-b'])"));
		
		Actions act = new Actions(Driver);
		act.dragAndDrop(cloA, cloB).build().perform();
		act.dragAndDropBy(cloA, 200, 500).build().perform();
		
		
	}

}
