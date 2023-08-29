package aaa;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertconfirm {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();;
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='Click here for output>>']")).click();
		Alert a =driver.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
		
	}
	
 
}
