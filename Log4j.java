package log4j;


import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import org.apache.log4j.xml.DOMConfigurator;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Log4j {

	private static WebDriver driver;

	private static Logger Log = Logger.getLogger(Log4j.class.getName());

	public static void main(String[] args) {

		DOMConfigurator.configure("log4j.xml");

		// Create a new instance of the Firefox driver

        driver = new FirefoxDriver();

        Log.info("New driver instantiated");

        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Log.info("Implicit wait applied on the driver for 10 seconds");

        //Launch the Online Store Website

        driver.get("http://www.googe.com");

        Log.error("Web application launched");

        
        driver.quit();

        Log.info("Browser closed");

	}

}