package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAndDeleteLead {

	public static void main(String[] args) {
		//https://github.com/TestLeafPages/SeleniumAssignments/blob/master/week2/day2.assignments/EditLead.java
			//https://github.com/TestLeafPages/SeleniumAssignments/blob/master/week2/day2.assignments/DeleteLead.java

		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		
		//click the lead button
        driver.findElement(By.xpath("//a[text()='Leads']")).click();
        //click the create lead
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Malathi");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mathiyalagan");
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Malathi");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("description");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("malathi.mathiyalagan@gmail.com");
        driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9765434323");
        //submit create lead
        driver.findElement(By.xpath("//input[@name='submitButton']")).click();
        //click find lead
        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
       
        //javascript to click phone button having span tag.. use this when there is no select tag 
        WebElement phone= driver.findElement(By.xpath("//span[text()='Phone']"));
        driver.executeScript("arguments[0].click()",phone);
        
        //enter phno
        driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9765434323");
        //click find lead
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
            
	}

}
