package aaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class staleemnt {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();;
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.name("login"));
		ele.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		ele.click();

	}

}
