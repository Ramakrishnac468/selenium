package practies;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames_Handle {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/iframe-practice-page/");
		Thread.sleep(3000);
		
		driver.switchTo().frame("iframe2");
		WebElement element=driver.findElement(By.xpath(".//*[@id='post-9']/header/h1"));
		String str=element.getText();
		System.out.println(str);
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		driver.switchTo().frame("iframe1");
		WebElement element2=driver.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div/div[1]/p[1]/em/strong"));
		String str2=element2.getText();
		System.out.println(str2);
		
		driver.quit();
		
	}

}
