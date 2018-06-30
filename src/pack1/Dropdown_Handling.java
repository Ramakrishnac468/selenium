package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdown_Handling {
	
	//public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\\\Softwares\\\\Drivers\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.buycrash.com/");
		WebElement ele=driver.findElement(By.xpath(".//*[@id='state_search']"));
		
		
		
	}

}
