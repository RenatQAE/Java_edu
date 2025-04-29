package ru.inno.todo.Selenium.webdriver.starting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecution {
    private static String URL = "https://the-internet.herokuapp.com/nested_frames";
    private static String REMOVE = "document.querySelector(\".search-page\").remove()";
    private static String EDIT_LOCAL_STORAGE = "localStorage.setItem(\"bestscore\",\"12345\")";
    private static String URL_GAME = "https://play2048.co/";
    private WebDriver driver;


    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }


    @Test
    public void getUrl(){

        driver.get(URL_GAME);
        ((JavascriptExecutor) driver).executeScript(EDIT_LOCAL_STORAGE);
        driver.navigate().refresh();

    }
}
