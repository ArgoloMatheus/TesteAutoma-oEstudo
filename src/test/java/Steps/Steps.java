package Steps;

import Executar.Executar;
import Pages.LoginPage;
import Pages.ProdutosPage;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;



public class Steps extends Executar {
    LoginPage loginPage = new LoginPage(driver);
    ProdutosPage produtos = new ProdutosPage(driver);
    @Dado("que estou no site da kabum")
    public void queEstouNoSiteDaKabum() throws Exception {
loginPage.acessarAplicacao();
loginPage.aceitarCookie();
loginPage.efetuarLogin();
loginPage.dadosDeLogin();
loginPage.clicarPopUp();
    }

    @Quando("quando eu pesquisar um produto")
    public void quandoEuPesquisarUmProduto() throws InterruptedException {
        produtos.selecionarProduto();
        produtos.clicarNaLupa();

    }

    @Quando("selecionar o produto")
    public void selecionarOProduto() throws InterruptedException {
        produtos.clicarNoProduto();

    }
    @Então("conclua minha compra")
    public void concluaMinhaCompra() throws InterruptedException {
        produtos.finalizarCompra();

    }
}
