package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProdutosPage {
    WebDriver driver;

    public ProdutosPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selecionarProduto() throws InterruptedException{
        driver.findElement(By.xpath("//input[@id='input-busca']")).click();
        driver.findElement(By.xpath("//input[@id='input-busca']")).sendKeys("RTX 3080");

    }
    public void clicarNaLupa() throws InterruptedException {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    public void clicarNoProduto() throws InterruptedException {
        driver.findElement(By.xpath("//span[text()='Placa de Vídeo Asus ROG Strix RTX 3080 Gaming OC, 12GB, GDDR6X, LHR, DLSS, RGB, Ray Tracing- 90YV0FAC-M0NA00']")).click();
    }
    public void finalizarCompra() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='sc-kgUAyh kKOQrR']")));
        //driver.findElement(By.xpath("//button[@class='sc-kgUAyh kKOQrR']")).click();
        element.click();
    }
    public void code() throws InterruptedException{
        String code = driver.findElement(By.xpath("//h1[@itemprop='name']")).getText();
        System.out.println("O nome do produto : " + code);
    }
}
