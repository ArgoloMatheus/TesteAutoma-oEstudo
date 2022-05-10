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
        driver.findElement(By.xpath("//input[@id='input-busca']")).sendKeys("ssd m2");

    }
    public void clicarNaLupa() throws InterruptedException {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    public void clicarNoProduto() throws InterruptedException {
        driver.findElement(By.xpath("//span[normalize-space()='SSD WD Blue, 500GB, M.2, Leitura 560MB/s, Gravação 530MB/s - WDS500G2B0B']")).click();
    }
    public void finalizarCompra() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='sc-kgUAyh kKOQrR']")));
        //driver.findElement(By.xpath("//button[@class='sc-kgUAyh kKOQrR']")).click();
        element.click();
    }
}
