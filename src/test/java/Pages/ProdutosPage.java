package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='sc-kgUAyh kKOQrR']")).click();
    }
}
