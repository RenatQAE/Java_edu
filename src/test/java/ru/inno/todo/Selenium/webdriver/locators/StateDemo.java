package ru.inno.todo.Selenium.webdriver.locators;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class StateDemo {
    // $$("[href='/ru/feedback/']")
    private static final Log log = LogFactory.getLog(ClickDemo.class);
    private static String URL = "https://the-internet.herokuapp.com/";
    private static String endpointAlerts = "javascript_alerts";
    private static String URLLabirint = "https://www.labirint.ru/";
    private static String URL_HABR = "https://habr.com/ru";
    private static String URL_UI_TEST = "http://uitestingplayground.com/textinput";
    //http://uitestingplayground.com/textinput

    private WebDriver driver;


    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


    @Test
    public void changeStateOfElements() {

        driver.get(URL+"dynamic_controls");
        WebElement checkbox = driver.findElement(By.cssSelector("input[type=checkbox]"));
       // checkbox.click();
        WebElement text = driver.findElement(By.cssSelector("input[type=text]"));

        assertFalse(checkbox.isSelected());
        assertFalse(text.isEnabled());
    }
}


