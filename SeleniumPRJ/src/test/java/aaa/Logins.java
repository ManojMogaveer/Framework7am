package aaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logins {
	
	//Deceleration
	@FindBy(id="email")
	private WebElement emailtf;
	
	@FindBy(id="pass")
	private WebElement passtf;
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement forgotpasswordlink;
	
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement cabtn;
	
	

	public WebElement getEmailtf() {
		return emailtf;
	}

	public WebElement getPasstf() {
		return passtf;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getForgotpasswordlink() {
		return forgotpasswordlink;
	}

	public WebElement getCabtn() {
		return cabtn;
	}
	
	//initialization
	public Logins(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void login()
	{
		emailtf.sendKeys("keer");
		passtf.sendKeys("123");
		loginbtn.click();
	}
//pull back
}
