/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sel.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 *
 * @author itexps
 */
public class SeleniumUtils {
    public static WebDriver getChromeDriver(){
        System.setProperty("webdriver.chrome.driver","c:\\qa\\drivers\\chromedriver.exe");
        return new ChromeDriver();
    }
    public static WebDriver getFirfoxDriver(){
        System.setProperty("webdriver.gecko.driver","c:\\qa\\drivers\\geckodriver.exe");
        return new FirefoxDriver();
    }
    public static WebDriver getEdgeDriver(){
        System.setProperty("webdriver.edge.driver","c:\\qa\\drivers\\msedgedriver.exe");
        DesiredCapabilities dc=DesiredCapabilities.edge();
        return new EdgeDriver(dc);
    }
    public static WebDriver getIEDriver(){
        System.setProperty("webdriver.ie.driver","c:\\qa\\drivers\\iedriverserver.exe");
        DesiredCapabilities dc=DesiredCapabilities.edge();
        return new InternetExplorerDriver();
    }

    public static void main(String[] args){
        getChromeDriver();
        getFirfoxDriver();
        //getEdgedriver();
        getIEDriver();
                
    }
}
