package Week2.day2;

import java.time.Duration;

import org.apache.commons.collections4.functors.CatchAndRethrowClosure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		
				 WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			//load the url
			driver.get("https://en-gb.facebook.com");
			//max window
			driver.manage().window().maximize();
			//add wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
			
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Malathi");
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mathiyalagan");
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9765432342");
			driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Malathi@123");
			//select[@id='day']
			//select[@id='month']
			//select[@id='year']
			 WebElement day = driver.findElement(By.xpath("(//select[@id='day'])"));
		        //include the Select class with webelement
		     Select drop1=new Select(day);
		     drop1.selectByVisibleText("14");
		     
		     WebElement month = driver.findElement(By.xpath("(//select[@id='month'])"));
		        //include the Select class with webelement
		     Select drop2=new Select(month);
		     drop2.selectByValue("10");   
		     
		     WebElement year = driver.findElement(By.xpath("(//select[@id='year'])"));
		        //include the Select class with webelement
		     Select drop3=new Select(year);
		     drop3.selectByVisibleText("1990"); 
		     driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
	  }
		 

		}
	 
		    
		    
		    
