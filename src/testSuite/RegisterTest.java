package testSuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {

    @Before
    public void setUp() {
        openBrowser();
    }

    @Test

    public void userShouldNavigateToRegisterPageSuccessfully() {
        //Click on register link
        WebElement loginLink = driver.findElement(By.className("ico-register"));
        loginLink.click();
        String registerMessage = driver.findElement(By.tagName("h1")).getText();
        //Comparing text Register
        Assert.assertEquals("Not right text", registerMessage, "Register");
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //Click on Register link in homepage
        driver.findElement(By.className("ico-register")).click();
        //Click on Male radio button
        driver.findElement(By.xpath("//input[@id='gender-male']")).click();
        //Clicking on Female radio button
        driver.findElement(By.xpath("//input[@id='gender-female']")).click();
       //Enter FirstName
        driver.findElement(By.id("FirstName")).sendKeys("Prime");
       //Enter LastName
        driver.findElement(By.name("LastName")).sendKeys("Testing");
        //Enter date of birth(Day)
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("27");
        //Enter date of birth(Month)
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("January");
        //Enter date of birth(year)
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1995");
       //Enter Email
        driver.findElement(By.id("Email")).sendKeys("Primea@gmail.com");
      //Enter Password
        driver.findElement(By.name("Password")).sendKeys("Prime123#");
      //Enter Confirm Password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Prime123#");
        //Clicking in Register button
        WebElement registerButton = driver.findElement(By.id("register-button"));
        registerButton.click();
        //Verify the message Your registration completed
        String actualMessage = driver.findElement(By.xpath("//div[@class='result']")).getText();

        String expectedMessageAfterRegistration = "Your registration completed";
        Assert.assertEquals("Message is not correct", expectedMessageAfterRegistration, actualMessage);
    }
    @After
    public void tearDown()
    {
        closeBrowser();
    }

}