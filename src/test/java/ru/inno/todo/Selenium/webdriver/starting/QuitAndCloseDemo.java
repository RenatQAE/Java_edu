package ru.inno.todo.Selenium.webdriver.starting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitAndCloseDemo {
   private static String URL = "https://the-internet.herokuapp.com/windows";
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

        driver.get(URL);
        driver.findElement(By.cssSelector("#content a")).click();
        driver.close();
        driver.quit();
    }

}
