package pack1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Reusable_Methods {
	
	public static WebDriver driver;
	
	public static void enterText(String str,String txt,String loc)
	{
		driver.findElement(By.xpath(loc)).sendKeys(txt);
	}
	
	public static void click(String str,String loc)
	{
		driver.findElement(By.xpath(loc)).click();
	}
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://docs.seleniumhq.com/");
		
		/*WebElement ele=driver.findElement(By.xpath(".//*[@id='q']"));
		ele.sendKeys("Hello");*/
		
		WebElement element=driver.findElement(By.xpath(".//*[@id='menu_projects']/a"));
		String str=element.getText();
		
		enterText("search text box","Hello",".//*[@id='q']");
		
		click("click go button",".//*[@id='submit']");
		
	}

}
