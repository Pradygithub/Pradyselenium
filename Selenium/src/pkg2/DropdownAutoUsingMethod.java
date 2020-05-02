package pkg2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropdownAutoUsingMethod 
{
  ChromeDriver driver;

public void Initial()
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\lenovo\\\\Desktop\\\\Chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Options op=driver.manage();
	Window W=op.window();
	W.maximize();
	this.dropdown("25", "Apr", "2005");
}
public void dropdown(String a, String b, String c)
{
	Select S1=new Select(driver.findElement(By.id("day")));
	Select S2=new Select(driver.findElement(By.id("month")));
	Select S3=new Select(driver.findElement(By.id("year")));
	S1.selectByVisibleText(a);
	S2.selectByVisibleText(b);
	S3.selectByVisibleText(c);
}
public void exit()
{
	driver.close();
}
public static void main(String args[])
{
	DropdownAutoUsingMethod obj=new DropdownAutoUsingMethod();
	obj.Initial();
	obj.exit();
}
}