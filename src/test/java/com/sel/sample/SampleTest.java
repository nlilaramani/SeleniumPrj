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

/**
 *
 * @author itexps
 */
public class SampleTest {
    
    public SampleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        driver=DriverUtils.getChromeDriver();
        driver.manage().window().maximize();
        //Window w=driver.manage().window();
        //w.maximize();
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
    WebDriver driver;
    @Test
    public void testIframe(){
        driver.get("file:///C:/Users/itexps/Documents/sample.html");
        driver.switchTo().frame("iframe_1");
        //driver.switchTo().window(string);
        driver.findElement(By.name("userName")).sendKeys("mercury");
    }
    
    @Test
    public void testAlert(){
        driver.get("file:///C:/Users/itexps/Documents/sample.html");
        try{
            driver.findElement(By.tagName("button")).click();
        }catch(Exception e){
            driver.switchTo().alert();
            
        }
        driver.switchTo().alert().accept();
    }
}
