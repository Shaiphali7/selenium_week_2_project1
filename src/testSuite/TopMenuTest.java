package testSuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {
    @Before
    public void setUp() {
        openBrowser();
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //Click on 'Computers' tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Computers ']")).click();
        //Getting text 'Computers'
        String actualComputerText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Computers ']")).getText();
        //Verifying the text
        String expectedComputerText = "Computers";
        Assert.assertEquals("Text is not same", expectedComputerText, actualComputerText);
    }

    @Test

    public void userShouldNavigateToElectronicsPageSuccessfully() {
//Clicking in Electronics Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']")).click();
        //Getting text 'Electronics'
        String actualElectronicsText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Electronics ']")).getText();
        //Verifying the text
        String expectedElectronicsText = "Electronics";
        Assert.assertEquals("Text is not same", expectedElectronicsText, actualElectronicsText);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        //Clicking in Apparel  Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).click();
        //Getting text 'Apparel '
        String actualApparelText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Apparel ']")).getText();
        //Verifying the text
        String expectedApparelText = "Apparel";
        Assert.assertEquals("Text is not same", expectedApparelText, actualApparelText);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //Clicking in Digital downloads Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).click();
        //Getting text 'Apparel '
        String actualDigitaldownloadsText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Digital downloads ']")).getText();
        //Verifying the text
        String expectedDigitaldownloadsText = "Digital downloads";
        Assert.assertEquals("Text is not same", expectedDigitaldownloadsText, actualDigitaldownloadsText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //Clicking in Books Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")).click();
        //Getting text 'Books'
        String actualBooksText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Books ']")).getText();
        //Verifying the text
        String expectedBooksText = "Books";
        Assert.assertEquals("Text is not same", actualBooksText, expectedBooksText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //Clicking in Jewelry  Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")).click();
        //Getting text 'Jewelry'
        String actualJewelryText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Jewelry ']")).getText();
        //Verifying the text
        String expectedJewelryText = "Jewelry";
        Assert.assertEquals("Text is not same", actualJewelryText,expectedJewelryText);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully()
    {
        //Clicking in Gift Cards Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")).click();
        //Getting text 'Gift Cards '
        String actualGiftCardsText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Gift Cards ']")).getText();
        //Verifying the text
        String expectedGiftCardsText = "Gift Cards";
        Assert.assertEquals("Text is not same", actualGiftCardsText,expectedGiftCardsText);
    }


    @After
    public void tearDown() {
        closeBrowser();
    }

}
