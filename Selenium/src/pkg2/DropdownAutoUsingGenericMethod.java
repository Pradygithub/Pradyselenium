package pkg2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropdownAutoUsingGenericMethod 
{
public void dropDownSelection(WebElement element, String visibleText) 
{
	Select s=new Select(element);
	s.selectByVisibleText(visibleText);
}
public void dropDownSelection(WebElement element, int IndexNo)
{
	Select s=new Select(element);
	s.selectByIndex(IndexNo);
}

public void dropDownSelection(String Value, WebElement element)
{
	Select s=new Select(element);
	s.selectByValue(Value);
}

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
	WebElement radio2=driver.findElement(By.cssSelector("input#u_0_7"));
	radio2.click();
	WebElement Daydropdown= driver.findElement(By.id("day"));
	WebElement Monthdropdown= driver.findElement(By.id("month"));
	WebElement Yeardropdown= driver.findElement(By.id("year"));
	DropdownAutoUsingGenericMethod obj=new DropdownAutoUsingGenericMethod();
	obj.dropDownSelection(Daydropdown, 15);
	obj.dropDownSelection(Monthdropdown, "Dec");
	obj.dropDownSelection("2020", Yeardropdown);
	WebElement Signupbutton=driver.findElement(By.cssSelector("button#u_0_13"));
	Signupbutton.click();
	//driver.close();
}
	
}
