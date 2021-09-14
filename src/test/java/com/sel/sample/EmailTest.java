/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sel.sample;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author itexps
 */
public class EmailTest {
    
    public EmailTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    WebDriver driver;
    @Before
    public void setUp() {
        driver=DriverUtils.getChromeDriver();
        driver.manage().window().maximize();
        WebDriver.Timeouts t=driver.manage().timeouts();
        t.implicitlyWait(50, TimeUnit.SECONDS);
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
    public void testEmailLogin() throws InterruptedException {
        driver.get("http://www.hotmail.com");
        WebElement e=driver.findElement(By.partialLinkText("Sign"));
        e.click();
        e=driver.findElement(By.id("i0116"));
        //e=driver.findElement(By.id("i0116"));
        e.sendKeys("SelSample@hotmail.com");
        //e=driver.findElement(By.className("btn-primary"));
        e=driver.findElement(By.id("idSIButton9"));
        new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(e));
        e.click();
        /*(e=driver.findElement(By.tagName("a"));
        e.click();*/
        // Excplicitwait
        //Thread.currentThread().sleep(4000);
        Thread.currentThread().sleep(1000); // Pause for 3 seconds
        
        // Explicit timeout using Selenium
        e=driver.findElement(By.xpath("//input[@type='password']"));
        new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(e));
        //ExpectedConditions.
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sel@123!");
        //driver.findElement(By.name("passwd")).sendKeys("Sel@123");
        driver.findElement(By.name("KMSI")).click();
        driver.findElement(By.name("KMSI")).submit();
        
    }
    @Test
    public void testEmailLogin1() throws InterruptedException {
        driver.get("http://www.msn.com");
        
        WebElement e=driver.findElement(By.partialLinkText("Sign"));
        e.click();
        e=driver.findElement(By.id("i0116"));
        //e=driver.findElement(By.id("i0116"));
        e.sendKeys("SelSample@hotmail.com");
        e=driver.findElement(By.className("btn-primary"));
        new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(e));
        e.click();
        /*(e=driver.findElement(By.tagName("a"));
        e.click();*/
        // Excplicitwait
        //Thread.currentThread().sleep(4000);
        Thread.currentThread().sleep(1000); // Pause for 3 seconds
        
        // Explicit timeout using Selenium
        e=driver.findElement(By.xpath("//input[@type='password']"));
        new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(e));
        //ExpectedConditions.
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sel@123!");
        //driver.findElement(By.name("passwd")).sendKeys("Sel@123");
        driver.findElement(By.name("KMSI")).click();
        driver.findElement(By.name("KMSI")).submit();
        
    }
}
