package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    public void openBrowser()
    {
        //BaseUrl declaration
        String baseUrl="https://demo.nopcommerce.com/";
        //Launch the chrome driver
        driver=new ChromeDriver();
        //Open the Url into the browser
        driver.get(baseUrl);
        //Maximise the window
        driver.manage().window().maximize();
        //Giving implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public void closeBrowser()
    {
        //Closing the current url and others as well
        driver.quit();
    }
}
