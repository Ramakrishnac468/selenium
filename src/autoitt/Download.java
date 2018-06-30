package autoitt;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Download {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.in/2014/05/login.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='post-body-4024384759750876807']/div[1]/div/a[1]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("");
		Thread.sleep(3000);
		
	}

}
