package Week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leafground.com/pages/checkbox.html");
		System.out.println(driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected());

	    System.out.println("!! java Is not selected");
	    System.out.println(driver.findElement(By.xpath("(//div[@class='example']/input)[6]")).isSelected());
	    System.out.println("!! Selenium is selected");
	    System.out.println(driver.findElement(By.xpath("(//div[@class='example']/input)[8]")).isSelected());
	    
	    WebElement c=driver.findElement(By.xpath("(//div[@class='example']/input)[8]"));
	    System.out.println(c.isSelected());
	    c.click();
	    System.out.println("!!DeSelect only checked");
	   
	    List<WebElement> checkList = driver.findElements(By.xpath("(//input[@type='checkbox'])"));
		System.out.println("Number of checbox:" + checkList.size());
		
		List<WebElement> ch1 =driver.findElements(By.xpath("(//input[@type='checkbox'])[9]//.."));
		int size =ch1.size();
		for (int i=0; i<size; i++) {
			WebElement checkoption = ch1.get(i);
			System.out.println(checkoption.getText());
			
		}
		
	
        //driver.quit();

	}

}
