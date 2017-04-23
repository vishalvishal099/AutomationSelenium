package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObj {
      
	WebDriver driver;
		 
		 
	public LoginPageObj(WebDriver ldriver)
		{
		this.driver=ldriver;
		}
		 
	@FindBy(id="Email") 
	   WebElement emailid;
	   
	   @FindBy(how=How.ID,using="next")
	   WebElement nextbtn;
	   
	   @FindBy(id="Passwd")
	   WebElement pass;
	   
	   @FindBy(id="signIn")
	   WebElement SignIn;
	   
	   public void login_wordpress(String ema,String Pas)
		{
		   emailid.sendKeys(ema);
		   nextbtn.click();
		   pass.sendKeys(Pas);
		   SignIn.click();
		}
	   
	   public void emailSendKeys(String uname){
		   emailid.sendKeys(uname);
	   }
	   public void NextBtnClk(){
		   nextbtn.click();
	   }
	   public void passSendKeys(String passd){
		   pass.sendKeys(passd);
	   }
	   public void signInBtnClk(){
		   SignIn.click();
	   }}