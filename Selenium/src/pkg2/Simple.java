package pkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple 
{
public static void main (String args[])
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com");
     Options op =driver.manage();
     Window w= op.window();
     w.maximize();
    WebElement user= driver.findElement(By.id("email"));
    user.sendKeys("Pradeep");
    WebElement password=driver.findElement(By.cssSelector("input#pass"));
    password.sendKeys("Pradeep");
    

}
}
