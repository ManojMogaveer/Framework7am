package aaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();;
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Logins l= new Logins(driver);
		l.login();

		l.getLoginbtn().click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		l.getLoginbtn().click();
		
		
	}
}
