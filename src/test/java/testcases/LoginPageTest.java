package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.Base;
import pages.LoginPage;

public class LoginPageTest extends Base {

	LoginPage loginPage;
	@BeforeMethod
	public void setup()  {
		initialization();
		loginPage = new LoginPage();	
	}

	@Test
	public void loginTest() throws InterruptedException {
		loginPage.appLogin();
		Thread.sleep(3000);
	}

	@Test
	public void passwordLink() throws InterruptedException {
		loginPage.forgotPassWord();
		Thread.sleep(3000);
	}

	@AfterMethod
	public void postTest() {
		tearDown();
	}

}
