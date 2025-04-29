package ru.inno.todo.Selenium.webdriver.keyboardActions;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import ru.inno.todo.Selenium.webdriver.locators.ClickDemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class KeyboardActions {
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
    public void KeyboardActions() {

        driver.get(URL_UI_TEST);

        Keys command = Platform.getCurrent().is(Platform.MAC) ?  Keys.COMMAND : Keys.CONTROL;
        long pause = 1000L;
        WebElement newButton = driver.findElement(By.cssSelector("#newButtonName"));
        newButton.click();
        Actions actions = new Actions(driver);
        actions
                .keyDown(Keys.LEFT_SHIFT)
                .sendKeys(newButton,"A")
                .pause(pause)
                .keyUp(Keys.LEFT_SHIFT)
                .pause(pause)
                .sendKeys(newButton, "lina- Molodec!")
                .pause(pause)
                .keyDown(Keys.LEFT_SHIFT)
                .keyDown(Keys.ARROW_UP)
                .keyUp(Keys.LEFT_SHIFT)
                .keyDown(command)
                .sendKeys("c")
                .sendKeys("v")
                .pause(pause)
                .sendKeys("v")
                .keyUp(command)
                .perform();



    }

}
