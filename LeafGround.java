package Week2.day2;

import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.http://leafground.com/pages/Edit.html
			//2.http://leafground.com/pages/Button.html
			//3.http://leafground.com/pages/Link.html
			//4.http://leafground.com/pages/Image.html
			//5.http://leafground.com/pages/checkbox.html
			//6.http://www.leafground.com/pages/Dropdown.html
		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// edit url
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("malathi.mathiyalagan@gmail.com");
		
		String attribute= driver.findElement(By.xpath("//input[@value='Append ']")).getAttribute("value");
		System.out.println(attribute);
		
		String text= driver.findElement(By.xpath("//label[contains(text(),'text entered')]")).getText();
		System.out.println(text);
		
		String attribute1= driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value");
		System.out.println(attribute1);
		
		System.out.println(driver.findElement(By.xpath("//label[contains(text(),'text entered')]/following::input")).isDisplayed());
		
		System.out.println(driver.findElement(By.xpath("//label[contains(text(),'text entered')]/following::input")).isEnabled());
		
		WebElement c=driver.findElement(By.xpath("(//input[@name='username'])[2]"));
		c.clear();
		//isEnabled used only for editable text	so it returns false	
		System.out.println(driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled());
	
		// button url
		
		driver.get("http://leafground.com/pages/Button.html");
		//return to home page
		driver.findElement(By.id("home")).click();	
		//click to button
		driver.findElement(By.linkText("Button")).click();
		//to get position x,y
		System.out.println(driver.findElement(By.id("position")).getLocation());
		System.out.println(driver.findElement(By.id("position")).getLocation().getX());
		//background-color is copied from filter...below the xpath finder
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		System.out.println(driver.findElement(By.id("color")).getSize().getHeight());
		
		//HyperLink url
		
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.linkText("Go to Home Page")).click();
		//to navigate page
		//driver.navigate().to("http://leafground.com/pages/Link.html");
		driver.findElement(By.linkText("HyperLink")).click();
		
		System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
		System.out.println(driver.findElement(By.linkText("Verify am I broken?")).getAttribute("href"));
		
	
		//System.out.println(driver.getPageSource());
		// to display tag name
		System.out.println(driver.findElement(By.linkText("How many links are available in this page?")).getTagName());
		
		//total no of links in web page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//alter
		//List<WebElement> links = driver.findElements(By.tagName("a"));
		//int count =links.size();
		//System.out.println("Total:" +count);
		
		driver.quit();
		}

	
}
