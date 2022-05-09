package Executar;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/Feature/",
        glue = "Steps",
        tags = "@testKabum",
        plugin = { "pretty", "html:target/report.html" },
        monochrome = true,
        snippets = SnippetType.CAMELCASE
)

public class Executar {

    public static WebDriver driver;

    @BeforeClass
    public static void start (){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Iniciou");



    }
    @AfterClass
    public static void stop() throws InterruptedException {
        //	Thread.sleep(15000);
        //	driver.quit();

    }
}