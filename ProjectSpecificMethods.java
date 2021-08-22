
package base;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class ProjectSpecificMethods {
		
		public static ChromeDriver driver;
		
		@BeforeMethod
		public void preCodition() {
			WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();		
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
		
		@AfterMethod
	    public void PostCondition() {
			driver.close();
		}
	}


