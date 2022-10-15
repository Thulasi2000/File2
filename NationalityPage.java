package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import CommonUtil.TestBrowser;

public class NationalityPage extends TestBrowser {
	
	
	//WebDriver driver;
	
	public void  NationalityPage()throws Exception
	{  
		//this.driver=TestBrowser.driver5;
		String str=driver.getWindowHandle();
		System.out.println("window session id :"+str);
	}
	
	public void AddNatioanlity(String NationalityText) throws Exception
	{
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")).click();
		WebElement Admin=findElement(By.xpath("//span[text()='Admin']"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(Admin).click().perform();
		
		findElement(By.linkText("Nationalities")).click();
		
		
		findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(NationalityText);
		
		
	    Thread.sleep(4000);
	    
	    findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	 
		
	}
	
public  WebElement findElement(By by) throws Exception {
		
	    WebElement elem = driver.findElement(by);
	    	    
	    // draw a border around the found element
	    if (driver instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);

	        
	    }
	    return elem;
	}
	


}
