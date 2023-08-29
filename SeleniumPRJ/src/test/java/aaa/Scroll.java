package aaa;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();;
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		 TakesScreenshot ts = (TakesScreenshot)driver;
		 
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 File dest = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\New folder\\a.png");
		 FileUtils.copyFile(src, dest);
		 
		 


	}

}
