package Shopping.Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Shopping.Resusablecomponent.AbstractComponent;

public class LandingPage extends AbstractComponent{
  
	WebDriver driver;
	 
	
	public LandingPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	 
	//WebElement userEmail=driver.findElement(By.id("userEmail"));
	//WebElement user= driver.findElement(By.id("userPassword"));
    //driver.findElement(By.id("login")).click();
    @FindBy( id="userEmail")
    WebElement userEmail;
    
    @FindBy(id="userPassword")
    WebElement userPassword;
    
    @FindBy(id="login")
    WebElement login;
    
    public void logingApplication(String email,String Passwords)
    {
    	userEmail.sendKeys(email);
    	userPassword.sendKeys(Passwords);
    	login.click(); 
    }
    
    public void goTo()
    {
    	driver.get("https://rahulshettyacademy.com/client");
    }
	
	
}
