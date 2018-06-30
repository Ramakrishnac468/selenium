package practies;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window_Handle {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		Thread.sleep(3000);
		
		String str=driver.getWindowHandle();
		System.out.println(str);
		driver.findElement(By.xpath(".//*[@id='button1']")).click();
		
		Set<String> str2=driver.getWindowHandles();
		System.out.println(str2);
		
		for(String str3:driver.getWindowHandles())
		{
			System.out.println(str3);
			driver.switchTo().window(str3);
		}
		driver.quit();
	}

}
