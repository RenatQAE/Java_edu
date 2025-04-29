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

public class MouseActions {
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
        actions.clickAndHold();
        actions.moveByOffset(160,20);
        actions.release();
        actions.perform();

    }
}
