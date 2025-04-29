package ru.inno.todo.Selenium.webdriver.locators;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Clear {
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
    public void clearInput() {

        driver.get(URL+"inputs");
        WebElement input = driver.findElement(By.cssSelector("input"));
        input.click();
        input.sendKeys("123");
        input.clear();
        input.click();
        input.sendKeys("567");
        input.sendKeys(Keys.ENTER);
        String text = input.getText();

        assertEquals("567",text);
        assertTrue(text.isEmpty());


    }
}
