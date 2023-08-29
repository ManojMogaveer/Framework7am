package aaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Vtiger {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();;
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		boolean b = ele.isEnabled();
		System .out.println(b);
		ele.sendKeys("");
	
		
		WebElement ele1 = driver.findElement(By.xpath("//input[@type='password']"));
		boolean b1 = ele.isEnabled();
		System .out.println(b1);
		ele1.sendKeys("aaa");
		
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.id("submitButton")).click();
		driver.close();
		
	}

}
