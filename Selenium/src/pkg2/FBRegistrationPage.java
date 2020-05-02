package pkg2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FBRegistrationPage 
{
public static void main(String args[])
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\lenovo\\\\Desktop\\\\Chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Options op=driver.manage();
	Window W=op.window();
	W.maximize();
	WebElement Firstname= driver.findElement(By.id("u_0_m"));
	Firstname.sendKeys("Pradeep");
	WebElement Surname= driver.findElement(By.name("lastname"));
	Surname.sendKeys("Panwar");
	WebElement Mobile=driver.findElement(By.cssSelector("input#u_0_r"));
	Mobile.sendKeys("9015320446");
	WebElement Newpassword= driver.findElement(By.cssSelector("input[ID=u_0_w"));
	Newpassword.sendKeys("POP");
	WebElement radio1=driver.findElement(By.cssSelector("input#u_0_6"));
	radio1.click();
	WebElement radio2=driver.findElement(By.cssSelector("input#u_0_7"));
	radio2.click();
	WebElement radio3=driver.findElement(By.cssSelector("input#u_0_8"));
	//radio3.click();
	WebElement Daydropdown= driver.findElement(By.id("day"));
	Select Day=new Select(Daydropdown);
	Day.selectByValue("4");
	WebElement Monthdropdown= driver.findElement(By.id("month"));
	Select Month=new Select(Monthdropdown);
	Month.selectByIndex(7);
	WebElement Yeardropdown= driver.findElement(By.id("year"));
	Select Year=new Select(Yeardropdown);
	Year.selectByVisibleText("2002");
	WebElement Signupbutton=driver.findElement(By.cssSelector("button#u_0_13"));
	Signupbutton.click();
	//driver.close();
}
}
