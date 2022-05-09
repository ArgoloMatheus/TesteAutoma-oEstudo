package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao() throws Exception {
        String baseUrl = "https://www.kabum.com.br/";
        driver.get(baseUrl);


    }
    public void efetuarLogin() throws InterruptedException{
        driver.findElement(By.xpath("//a[@id='linkLoginHeader']")).click();
    }
    public void dadosDeLogin() throws InterruptedException{
        driver.findElement(By.xpath("//input[@id='inputUsuarioLogin']")).click();
        driver.findElement(By.xpath("//input[@id='inputUsuarioLogin']")).sendKeys("matheus.silva185@gmail.com");
        driver.findElement(By.xpath("//input[@id='inputSenhaLogin']")).click();
        driver.findElement(By.xpath("//input[@id='inputSenhaLogin']")).sendKeys("@Maxmateus123");
        driver.findElement(By.xpath("//button[@id='botaoLogin']")).click();
    }
    public void clicarPopUp() throws InterruptedException{
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='buttonNaoTenhoInteresse']")).click();

    }
    public void aceitarCookie() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
    }

}