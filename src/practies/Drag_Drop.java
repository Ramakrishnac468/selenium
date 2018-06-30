package practies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/selenium/drag_drop.html");
		WebElement source=driver.findElement(By.xpath(".//*[@id='credit2']/a"));
		WebElement target=driver.findElement(By.xpath(".//*[@id='bank']/li"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}

}
