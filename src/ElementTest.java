import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementTest {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuru\\Desktop\\Selenium\\Browsers\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");	
		driver = new ChromeDriver(options);
		//driver.manage().window().maximize();
	}
	@Test
	public void Test() {
		driver.get("https://www.macys.com/");
		driver.findElement(By.xpath("//*[@id=\"row1_column1\"]/div[2]/div[4]/img"));
		driver.findElement(By.id("Layer_1"));
		driver.findElement(By.xpath("//*[@id=\"globalSearchInputField\"]")).sendKeys("768567345");
		driver.findElement(By.xpath("//*[@id=\"globalUserDetails\"]/div/a")).click();
		driver.findElement(By.id("email")).sendKeys("ahmedkabir@gmail.com");
		driver.findElement(By.id("password")).sendKeys("7778888");
		driver.findElement(By.xpath("//*[@id=\"signInBtn\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"signInForm\"]/div/div/div[2]/a")).click();
	}
}
