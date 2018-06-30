package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.ufthelp.com/");
		WebElement pe=driver.findElement(By.xpath(".//*[@id='wrap2']/div[5]/div[1]/ul/li[3]/a"));
		WebElement ce=driver.findElement(By.xpath(".//*[@id='wrap2']/div[5]/div[1]/ul/li[3]/ul/li[2]/a"));
		
		Actions act=new Actions(driver);
		act.moveToElement(pe).moveToElement(ce).click().build().perform();
	}

}
