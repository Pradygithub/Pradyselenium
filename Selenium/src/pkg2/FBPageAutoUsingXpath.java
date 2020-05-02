package pkg2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBPageAutoUsingXpath 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\lenovo\\\\Desktop\\\\Chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Options op=driver.manage();
		Window W=op.window();
		W.maximize();
		WebElement Firstname= driver.findElementByXPath("//input[@name='firstname']");
		Firstname.sendKeys("Sandeep");
		WebElement Surname=driver.findElementByXPath("//input[@name='lastname'and @id='u_0_o']");
		Surname.sendKeys("Singh");
		WebElement Mobile=driver.findElementByXPath("//input[@name='reg_email__' or @id='u_0_r']");
		Mobile.sendKeys("9015320446");
		WebElement Newpassword= driver.findElementByXPath("//input[@data-type='password'and @id ='u_0_w']");
		Newpassword.sendKeys("top");
		WebElement Daydropdown=driver.findElementByXPath("//*[@*='day']");
		Select Day=new Select(Daydropdown);
		Day.selectByIndex(4);
		WebElement Monthdropdown=driver.findElementByXPath("//*[@*='month']");
		Select Month=new Select(Monthdropdown);
		Month.selectByVisibleText("Dec");
		WebElement Yeardropdown=driver.findElementByXPath("//select[contains(@title,'Year')]");
		Select Year=new Select(Yeardropdown);
		Year.selectByVisibleText("2005");
		WebElement Gender=driver.findElementByXPath("//input[@name='sex' and @value='1']");
		Gender.click();
		WebElement Signupbutton=driver.findElementByXPath("//button[text()='Sign Up']");
		Signupbutton.click();KD 
		
}
}