package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import CommonUtil.TestBrowser;



public class LoginPage extends TestBrowser{
	
	//WebDriver driver;
	LoginPage L1;
	TestBrowser T1;
	
	/*public void  LoginPage()throws Exception
	{  
		this.driver=L1.driver;
	}*/
	

	
	public void Login_Orange() throws Exception
	{
		
		//T1=new TestBrowser();
		driver=OpenChromeBrowser();
		//String str=driver.getWindowHandle();
		//System.out.println("window session id :"+str);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	public void Login(String username,String password) throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		findElement(By.name("username")).sendKeys(username); 
		findElement(By.name("password")).sendKeys(password);
		findElement(By.xpath("//button[@type='submit']")).click();
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
