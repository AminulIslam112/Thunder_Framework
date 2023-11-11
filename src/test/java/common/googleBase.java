package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googleBase {
	
	public WebDriver Driver;
	 public void lauchBrowser() {
		 
	
	
	WebDriverManager.chromedriver().setup();
	Driver = new ChromeDriver();
	Driver.get("https://www.google.com/");
	Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	
	
	 }
	
	 public void closeAll() {
			Driver.quit();
		}
		
		public void closeCurrent() {
			Driver.close();
		}
}
