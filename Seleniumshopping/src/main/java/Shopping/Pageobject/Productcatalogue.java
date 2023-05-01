package Shopping.Pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Shopping.Resusablecomponent.AbstractComponent;

public class Productcatalogue extends AbstractComponent{
  
	WebDriver driver;
	
	String productName ="ZARA COAT 3";
	public Productcatalogue(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	 
	/* List<WebElement> prds=driver.findElements(By.cssSelector(".mb-3"));
    System.out.println(prds.size());
    System.out.println(prds);
 WebElement prod =   prds.stream().filter(prd-> prd.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);*/
    
    @FindBy( css=".mb-3")
    List <WebElement> Product;
    
   By productsBy= By.cssSelector(".mb-3");
   By addToCart=By.cssSelector(".card-body button:last-of-type");
   
    
   public List<WebElement> getProductList()
   {
	   waitForElementToAppear(productsBy);
	   return Product;
   }
   
    public WebElement getproductByName(String productName)
    {
    	WebElement prod =getProductList().stream().filter(prd->prd.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
    
        return prod;
        
        
    }
    
    public void addProductToCart(String productName) throws InterruptedException
    {
    	WebElement prod=getproductByName(productName);
    	prod.findElement(addToCart).click();
    }
	
}
