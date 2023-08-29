package ORANGE_HRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Adminusermng {
	

	@FindBy(xpath="(//a)[2]")
	private WebElement Adminbtn;
	
	
	@FindBy(xpath="(//div/input[1])[2]")
	private WebElement username;
	
	@FindBy(xpath="(//div[text()='-- Select --'])[1]")
	private WebElement userroleselect;
	
	
	
	
	public WebElement getAdminbtn() {
		return Adminbtn;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement Adminbtntf() {
		return Adminbtn;
	}
	public WebElement getUserroleselect() {
		return userroleselect;
	}

	
	
	
	
	
	public Adminusermng(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Admin() throws Throwable
	{
		Adminbtn.click();
		Thread.sleep(3000);
		username.sendKeys("Manoj");
		Thread.sleep(3000);
		Select s= new Select(userroleselect);
		s.selectByValue("Admin");
		
		
	}
	
}
