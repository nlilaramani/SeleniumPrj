/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sel.sample.DriverUtils;
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
        driver=DriverUtils.getChromedriver();
        /*driver=SeleniumUtils.getFirfoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();*/
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
       // Thread.currentThread().sleep(2000);
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Selenium jobs"));
    }
    
    
    @Test
    public void testFlightBooking(){
        driver.get("http://newtours.demoaut.com");
        WebElement e;
        driver.findElement(By.name("userName")).sendKeys("mercury");
        driver.findElement(By.name("password")).sendKeys("mercury");
        driver.findElement(By.name("login")).click();
    }*/
    @Test
    public void testGmailLogin(){
        driver.get("http://www.hotmail.com");
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("i0116")).sendKeys("selsample@hotmail.com");
        driver.findElement(By.className(("btn-primary"))).click();
        driver.findElement(By.name("passwd")).sendKeys("Sel@123!");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.id("idSIButton9")).click();
        //driver.findElement(By.id("identifierId")).sendKeys("nlilaramani@gmail.com");
        driver.findElement(By.xpath("//span[text()='New message']")).click();
        //ms-Button _33rLSYbzxvhXjgYTwfjWQI _1ojerECVeZlAkHtklkKOj5 ms-Button--commandBar root-54
    }
}
