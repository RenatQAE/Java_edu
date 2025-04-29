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

public class CopyText {
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
    public void copyText() {

        driver.get(URL_UI_TEST);
        WebElement newButton = driver.findElement(By.cssSelector("#newButtonName"));
        newButton.click();
        newButton.sendKeys("Hello!");
        newButton.sendKeys(Keys.LEFT_SHIFT,Keys.ARROW_UP);
        newButton.sendKeys(Keys.LEFT_CONTROL,"c");
        newButton.sendKeys(Keys.LEFT_CONTROL,"v");
        newButton.sendKeys(Keys.LEFT_CONTROL,"v");
        newButton.sendKeys(Keys.LEFT_CONTROL,"v");



        WebElement updatingButton = driver.findElement(By.cssSelector("#updatingButton"));
        updatingButton.click();
        String getText = updatingButton.getText();
        String textToBe = "Hello!Hello!Hello!";
        assertEquals(textToBe,getText);

    }
}

