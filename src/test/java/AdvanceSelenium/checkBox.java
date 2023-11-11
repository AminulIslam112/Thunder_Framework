package AdvanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class checkBox {

	public static void main(String [] args) throws InterruptedException {
		
		WebDriver Driver;
		
		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver();
		Driver.get("https://the-internet.herokuapp.com/checkboxes");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement chk1 = Driver.findElement(By.xpath("(//input[@ type ='checkbox'])[1]"));
		
		WebElement chk2 = Driver.findElement(By.xpath("(//input[@ type ='checkbox'])[2]"));
		
		if(chk1.isSelected()) {
			System.out.println("check box 1 is selected");
		}
		
		else {
			chk1.click();
			Thread.sleep(5000);
			Driver.quit();
			
			
		}
	}
}
