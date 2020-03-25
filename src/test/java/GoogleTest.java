/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sel.sample.SeleniumUtils;
import java.util.concurrent.TimeUnit;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author itexps
 */
public class GoogleTest {
    
    public GoogleTest() {
    }
    WebDriver driver;
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        //driver=SeleniumUtils.getChromedriver();
        driver=SeleniumUtils.getFirfoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testGoogleSearch() throws InterruptedException{
        driver.get("http://www.google.com");
        WebElement e=driver.findElement(By.name("q"));
        e.sendKeys("Selenium jobs");
        e.submit();
        Thread.currentThread().sleep(2000);
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Selenium jobs"));
    }
}
