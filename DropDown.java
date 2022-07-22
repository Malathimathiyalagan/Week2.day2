package Week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		//selectbyindex
		//System.out.println("SelectByIndex");
		WebElement source= driver.findElement((By.id("dropdown1")));
		Select drop1=new Select(source);
	    drop1.selectByIndex(4);
	   
		List <WebElement> options1 = drop1.getOptions();
		System.out.println(options1);
		
		//selectbytext
		//System.out.println("SelectByVisibleText");
		WebElement source1= driver.findElement((By.name("dropdown2")));
		Select drop2=new Select(source1);
	    drop2.selectByVisibleText("Appium");
	    
		List <WebElement> options2 = drop2.getOptions();
		System.out.println(options2);
		
		//selectbyvalue
		//System.out.println("SelectByvalue");
		WebElement source3= driver.findElement((By.id("dropdown3")));
		Select drop3=new Select(source3);
	    drop3.selectByValue("1");
	    
		List <WebElement> options3 = drop2.getOptions();
		System.out.println(options3);
		
		//list no of dropdown option
		List<WebElement> options = driver.findElements(By.xpath("(//select[@class='dropdown'])/option"));
		System.out.println("Number of dropdowns:" + options.size());
		WebElement source4 =driver.findElement(By.xpath("(//select[@class='dropdown'])"));
		Select drop4= new Select(source4);
		drop4.selectByValue("3");
		
       driver.findElement(By.xpath("(//div[@class='example'])[5]/select")).sendKeys("selenium");
       Select  s =new Select(driver.findElement(By.xpath("(//div[@class='example'])[6]/select")));
       if (s.isMultiple()) {
    	   s.selectByValue("1");
    	   s.selectByVisibleText("Appium");
    	   s.deselectByIndex(2);
       }
     
	}

}
