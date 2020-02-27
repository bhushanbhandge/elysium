package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	 WebDriver ldriver;
	 
	 public LoginPage(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	 
	 @FindBy(id="email-form")
	 @CacheLookup
	 WebElement txtEmail;
	 
	 @FindBy(id="password-form")
	 @CacheLookup
	 WebElement txtPassword;
	 
	 @FindBy(xpath="\"/html/body/app-root/app-login-component/html/body/div/div/div[1]/form/div/div[3]/button\"")
	 @CacheLookup
	 WebElement btnLogin;
	 
	 @FindBy(xpath="/html/body/app-root/app-header/nav/div/div[3]/section/ul/li")
	 @CacheLookup
	 WebElement btnprofile;
	 
	 @FindBy(xpath="//*[@id=\"dropdown-basic\"]/li[2]/a")
	 @CacheLookup
	 WebElement btnlogout;
	 
	 public void serUserName(String uname) {
		 txtEmail.clear();
		 txtEmail.sendKeys(uname);
	 }

	 public void serPassword(String pwd) {
		 txtPassword.clear();
		 txtPassword.sendKeys(pwd);
	 }
	 
	 public void clickLogin() {
		 btnLogin.click();
	 }
	 
	 public void clickLogout() {
		 btnprofile.click();
		 btnlogout.click();
	 }
	 
}
