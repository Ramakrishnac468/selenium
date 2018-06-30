package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandling {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");

		// Simple alert

		//driver.findElement(By.xpath(".//*[@id='content']/p[4]/button")).click();
		
		 //Confirmation alert
		
		//driver.findElement(By.xpath(".//*[@id='content']/p[8]/button")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		
		//Prompt alert
		
		driver.findElement(By.xpath(".//*[@id='content']/p[11]/button")).click();
		Alert alt=driver.switchTo().alert();
		Thread.sleep(3000);
		alt.sendKeys("hello");
		Thread.sleep(3000);
		alt.accept();
		 
		 

	}

}
