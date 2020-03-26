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

/**
 *
 * @author itexps
 */
public class FlightBookingTest {
    
    public FlightBookingTest() {
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
    @Test
    public void testLogin(){
        driver.get("http://newtours.demoaut.com");
        By by=By.name("userName");
        WebElement e=driver.findElement(by);
        e.sendKeys("mercury");
        //driver.f9indElement(By.name("userName")).sendKeys("mercury");
        by=By.name("password");
        e=driver.findElement(by);
        e.sendKeys("mercury");
    }
}
