package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundImage {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//image url
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		System.out.println("!!go to home page is clicked");
		//to navigate by using link
		//driver.navigate().to("http://leafground.com/pages/Image.html");
	    //to navigate by using back()
		driver.navigate().back();
		//get Am i broken using parent to child path
		System.out.println(driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[2]/label")).getText());
		
        //to get img
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[3]/img")).click();
		System.out.println("!!keybord is clicked");
		
		driver.quit();
	}
}
