package ORANGE_HRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orange {
	//Deceleration
			


	
			@FindBy(name="username")
			private WebElement usernametf;
			
			@FindBy(name="password")
			private WebElement passwordtf;
			
			@FindBy(xpath="//button[@type='submit']")
			private WebElement lognbtn;
			
			@FindBy(xpath="//p[text()='Forgot your password?']")
			private WebElement Forgtlink;
	//////////////////////////////////////////////////////////////////////////		
			
			public WebElement getUsernametf() {
				return usernametf;
			}
			
			public WebElement getPasswordtf() {
				return passwordtf;
			}

			public WebElement getLognbtn() {
				return lognbtn;
			}


			public WebElement getForgtlink() {
				return Forgtlink;
			}
			
//////////////////////////////////////////////////////////////////////////////////			

			//initialization
			public Orange(WebDriver driver)
			{
				System.out.println("AAAAManoj");
				PageFactory.initElements(driver,this);
				driver.manage().window().maximize();
				
			}

//////////////////////////////////////////////////////////////////////			
			//utilization
			public void loginq()
			{
				
				usernametf.sendKeys("Admin");
				passwordtf.sendKeys("admin123");
				lognbtn.click();
				
			}
			public void forgotpassword()
			{
				Forgtlink.click();
			}
}
