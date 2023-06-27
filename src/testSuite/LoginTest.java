package testSuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    @Before
    public void setUp() {
        openBrowser();
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
    //Clicking on Login link
        driver.findElement(By.className("ico-login")).click();
//Getting the message 'Welcome, Please sign In!'
        String actualMessage=driver.findElement(By.tagName("h1")).getText();
        String expectedMessageAtLoginPage="Welcome, Please Sign In!";
        //Verifying the message 'Welcome, Please sign In!'
        Assert.assertEquals("Correct message not displayed",actualMessage,expectedMessageAtLoginPage);

    }
@Test
public void userShouldLoginSuccessfullyWithValidCredentials()
{
    String logOutLinkMessageExpectedResult="Log out";
    //Clicking on Login link
    driver.findElement(By.className("ico-login")).click();
    //Entering valid userName
    driver.findElement(By.id("Email")).sendKeys("mjsonia2@gmail.com");
    //Entering valid password
    driver.findElement(By.name("Password")).sendKeys("Coco1234#");
    //Clicking on login button
    driver.findElement(By.xpath("//button[text() ='Log in']")).click();
    //verifying the 'Log out' text at the top display
String logOutLinkMessage=driver.findElement(By.className("ico-logout")).getText();
  Assert.assertEquals(logOutLinkMessageExpectedResult,logOutLinkMessage);
}
@Test
public void verifyTheErrorMessage()
{
    String logOutLinkMessageExpectedResult="Log out";
    //Clicking on Login link
    driver.findElement(By.className("ico-login")).click();
    //Entering valid userName
    driver.findElement(By.id("Email")).sendKeys("mjsonia2@gmail.com");
    //Entering valid password
    driver.findElement(By.name("Password")).sendKeys("Coco");
    //Clicking on login button
    driver.findElement(By.xpath("//button[text() ='Log in']")).click();
    String errorMessageActual=driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
    System.out.println(errorMessageActual);
    String errorMessageExpected="Login was unsuccessful. Please correct the errors and try again.";
   Assert.assertEquals("Not correct message",errorMessageActual,errorMessageExpected);
}
    @After
    public void tearDown() {
       closeBrowser();
    }
}
