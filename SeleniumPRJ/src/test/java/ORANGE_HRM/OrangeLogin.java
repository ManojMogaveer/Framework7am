package ORANGE_HRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ORANGE_HRM.Orange;


import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeLogin {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();;
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		Orange or= new Orange(driver);
		Thread.sleep(3000);
		or.loginq();
		
		
		Adminusermng or2 = new Adminusermng(driver);
		Thread.sleep(3000);
		or2.Admin();

		
		

	}

}
