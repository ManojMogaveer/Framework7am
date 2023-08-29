package aaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoprctice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();;
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//WebElement ele = driver.findElement(By.xpath("//p[text()='Forgot your password?']"));
		WebElement ele = driver.findElement(By.name("username"));
		ele.sendKeys("aaa");

	}

}
