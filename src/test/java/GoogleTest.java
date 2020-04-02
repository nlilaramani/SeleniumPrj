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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        driver=DriverUtils.getChromeDriver();
        /*driver=SeleniumUtils.getFirfoxDriver();*/
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
   /* @Test
    public void testGoogleSearch() throws InterruptedException{
        driver.get("http://www.google.com");
        WebElement e=driver.findElement(By.name("q"));
        e.sendKeys("Selenium jobs");
        e.submit();
       // Thread.currentThread().sleep(2000);
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Selenium jobs"));
    }*/
    
    
    /*@Test
    public void testFlightBooking(){
        driver.get("http://newtours.demoaut.com");
        WebElement e;
        driver.findElement(By.name("userName")).sendKeys("mercury");
        driver.findElement(By.name("password")).sendKeys("mercury");
        driver.findElement(By.name("login")).click();
    }*/
    @Test
    public void testGmailLogin() throws InterruptedException{
        driver.get("http://www.hotmail.com");
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("i0116")).sendKeys("selsample@hotmail.com");
        WebElement btn=driver.findElement(By.className(("btn-primary")));
        new WebDriverWait(driver,30).until(ExpectedConditions.elementToBeClickable(btn));
        //driver.findElement(By.className(("btn-primary"))).click();
        btn.click();
        Thread.currentThread().sleep(2000);
        WebElement p=driver.findElement(By.name("passwd"));
        p.sendKeys("Sel@123!");
        WebElement c=driver.findElement(By.xpath("//input[@type='checkbox']"));
        new WebDriverWait(driver,30).until(ExpectedConditions.elementToBeClickable(c));
        c.click();
        //driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.id("idSIButton9")).click();
        //driver.findElement(By.id("identifierId")).sendKeys("nlilaramani@gmail.com");
        driver.findElement(By.xpath("//span[@data-automationid='splitbuttonprimary']")).click();
        //ms-Button _33rLSYbzxvhXjgYTwfjWQI _1ojerECVeZlAkHtklkKOj5 ms-Button--commandBar root-54
    }
    
    @Test
    public void testMultipleTabs(){
        String wh1=driver.getWindowHandle();
        driver.get("http://www.google.com");
        String link="https://www.microsoft.com";
        ((JavascriptExecutor)driver).executeScript("window.open('http://www.microsoft.com');");
        String wh2 = (String)driver.getWindowHandles().toArray()[1];   //driver.switch_to.window(window_after)
        //String wh2=driver.getWindowHandle();
        System.out.println(wh2);
        if(driver.getWindowHandle()!=wh2){
            driver.switchTo().window(wh2);
        }
        driver.get("https://www.gmail.com");
        //driver.
    }
    
    @Test
    public void testPopups(){
        driver.get("file:///C:/Users/itexps/Documents/sample.html");
        driver.findElement(By.tagName("button")).click();
        String alerttext=driver.switchTo().alert().getText();
        System.out.println(alerttext);
        driver.switchTo().alert().dismiss();
              
    }
    @Test
    public void testIframe(){
        driver.get("file:///C:/Users/itexps/Documents/sample.html");
        driver.switchTo().frame("iframe_1");
        driver.findElement(By.name("userName")).sendKeys("mercury");
        
    }
    @Test
    public void testMercuryBooking(){
        driver.get("http://newtours.demoaut.com");
        driver.findElement(By.name("userName")).sendKeys("mercury");
        driver.findElement(By.name("password")).sendKeys("mercury");
        driver.findElement(By.name("login")).click();
        driver.findElements(By.name("tripType")).get(1).click();
        driver.findElement(By.name("passCount")).sendKeys("2");
        WebElement e=driver.findElement(By.name("fromPort"));
        Select s=new Select(e);
        s.selectByIndex(3);
    }
}
