package pack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadDataFromConfigFile {
	
	public static void main(String[] args) throws IOException {
		
		String filepath="D:\\Softwares\\MyWorkSpace\\Seleniumm\\config.properties";
		
		File f=new File(filepath);
		FileInputStream fis=new FileInputStream(f);
		Properties p=new Properties();
		p.load(fis);
		
		System.setProperty("webdriver.gecko.driver", "D:\\\\Softwares\\\\Drivers\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(p.getProperty("url"));
		driver.findElement(By.id(p.getProperty("emailTxtId"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.id(p.getProperty("passTxtId"))).sendKeys(p.getProperty("pass"));
	}

}
