package ru.inno.todo.Selenium.webdriver.locators;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class XPath {
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
    public void getByLocator() {

        driver.get(URL_HABR);
        WebElement logo = driver.findElement(By.cssSelector(".tm-header__logo"));
        //driver.findElement(By.xpath("//*[@id='app']"));
        //driver.findElement(By.linkText(""));

        // найти много элементов, вернет список
        List<WebElement> links = driver.findElements(By.cssSelector("a"));
        assertTrue(links.size()>0);
        System.out.println(links);
        assertNotNull(logo);
    }
}
