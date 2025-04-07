package testNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Prog10 {

	 
	
		WebDriver driver;	
		@Test(priority=1)
		void openBrowser(){
			driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com");
			driver.manage().window().maximize();
		}

		@Test(priority=2)
		void login(){
			
			driver.findElement(By.id("user-name")).click();
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.name("password")).sendKeys("secret_sauce"); 				
			driver.findElement(By.name("login-button")).click();
			boolean flag=driver.findElement(By.xpath("//button[text()=\"Open Menu\"]")).isDisplayed(); 
			if(flag==true){
				System.out.println("User is successfully logged in");
			}
			else{
				System.out.println("User is not logged in successfully");
			}
		}

		@Test(priority=3)
		void close(){
			driver.close();
		}
	}


