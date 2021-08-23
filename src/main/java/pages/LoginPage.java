package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class LoginPage extends Base{

//	private WebElement name=driver.findElement(By.name("email"));
//	private WebElement password=driver.findElement(By.name("password"));
//	private WebElement login=driver.findElement(By.xpath("//div[text()='Login']"));
//	private WebElement forgotPassword=driver.findElement(By.xpath("//a[text()='Forgot your password?']"));
	
	
	@FindBy(name="email")
	WebElement name;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement login;
	
	@FindBy(xpath="//a[text()='Forgot your password?']")
	WebElement forgotPassword;
	
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void appLogin() throws InterruptedException {
		Thread.sleep(5000);
		name.sendKeys("bunny147852@gmail.com");
		password.sendKeys("test@123");
		login.click();
	}
	
	public void forgotPassWord() throws InterruptedException {
		Thread.sleep(5000);
		forgotPassword.click();
	}
	
	
}
