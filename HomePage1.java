package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CommonUtil.TestBrowser;

public class HomePage1 extends TestBrowser {

	
//WebDriver driver;
	
	/*public void  HomePage()throws Exception
	{  
		this.driver=driver5;
	}*/
	
	public void Logout() throws InterruptedException
	{
		driver.close();
		Thread.sleep(2000);
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
