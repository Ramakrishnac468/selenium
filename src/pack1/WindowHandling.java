package pack1;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {

	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\\\Softwares\\\\Drivers\\\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// default wait for every object inside the
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		String pw = driver.getWindowHandle();
		System.out.println(pw);
		driver.findElement(By.xpath(".//*[@id='button1']")).click();

		System.out.println();
		
		Set<String> ws = driver.getWindowHandles();
		
		for (String s : ws) {
			
			System.out.println(s);
			if (!pw.equals(s)) {
				
				driver.switchTo().window(s);
				driver.manage().window().maximize();
				// driver.switchTo().defaultContent();
				if (!(driver.getWindowHandle()).equals(s)) {
					
					driver.switchTo().window(s);
					driver.close();
				}

				// driver.quit();
			}
		}
	}
}
