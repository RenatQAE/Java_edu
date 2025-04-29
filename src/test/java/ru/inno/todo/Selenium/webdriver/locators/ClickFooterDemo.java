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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ClickFooterDemo {
    // $$("[href='/ru/feedback/']")
    private static final Log log = LogFactory.getLog(ClickDemo.class);
    private static String URL = "https://the-internet.herokuapp.com/";
    private static String endpointAlerts = "javascript_alerts";
    private static String URLLabirint = "https://www.labirint.ru/";
    private static String URL_HABR = "https://habr.com/ru";

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
    public void clickFooter() {

        driver.get(URL_HABR);
     //   driver.findElement(By.cssSelector("[href='/ru/feedback/']")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/div/a"));
   // a[class='tm-footer__link']
   //[href='/ru/feedback/']
    //    /html/body/div[1]/div/div/div[4]/div/div/a
        String getCurrentUrl = driver.getCurrentUrl();
        String urlToBe = "https://habr.com/ru/feedback/";

        assertEquals(urlToBe,getCurrentUrl);
    }
}
