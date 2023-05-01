package shopping;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Shopping.Pageobject.LandingPage;
import Shopping.Pageobject.Productcatalogue;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Firstnew {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String productName="ZARA COAT 3";
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		// options.setHeadless(true);
		// options.addArguments("--headless=new");
		options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        //driver.get("https://rahulshettyacademy.com/client");
        driver.manage().window().maximize();
        LandingPage landingPage= new LandingPage(driver);
        landingPage.goTo();
        landingPage.logingApplication("dhar@gmail.com", "Dhar@123.");
        Thread.sleep(2000);
        
        Productcatalogue productcatalogue =new Productcatalogue(driver);
      //List<WebElement>  products=productcatalogue.getProductList();
     // System.out.println(products);
      productcatalogue.addProductToCart(productName);
        /* driver.findElement(By.id("userEmail")).sendKeys("dhar@gmail.com");
        driver.findElement(By.id("userPassword")).sendKeys("Dhar@123.");
        driver.findElement(By.id("login")).click(); */
        
      // List<WebElement> prds=driver.findElements(By.cssSelector(".mb-3"));
        // System.out.println(prds.size());
         //System.out.println(prds);
      //WebElement prod =   prds.stream().filter(prd-> prd.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
      //WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
             
         
//prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();        








//driver.quit();
	}
	
}
