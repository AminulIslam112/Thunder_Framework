package AdvanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseHover {

	public static void main(String[] args) throws InterruptedException {

		WebDriver Driver;
		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver();
		Driver.get("https://the-internet.herokuapp.com/hovers");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement img1 = Driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
		
		Actions act = new Actions(Driver);
		
		
		act.moveToElement(img1).build().perform();
		
		WebElement text1 = Driver.findElement(By.xpath("(//div[@class='figcaption'])[1]/h5"));
		Assert.assertEquals(text1.getText(),"name: user1");
		
		WebElement link1 = Driver.findElement(By.xpath("(//div[@class='figcaption'])[1]/a"));
		
		Assert.assertTrue(link1.isEnabled());
		
		Thread.sleep(5000);
		
		Driver.quit();
	}


		
	
	
	
	
	
	
	
}
