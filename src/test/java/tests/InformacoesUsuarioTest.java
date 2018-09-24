package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InformacoesUsuarioTest {
    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario(){

        try {
            //Abrindo o navegador
            System.setProperty("webdriver.chrome.driver", "/Users/larissademiranda/Projects/chromedriver/chromedriver");
            WebDriver navegador = new ChromeDriver();

            //Navegando para a página do Google!
            navegador.get("https://www.bing.com/");

            // Clicar no campo que possui o id "sb_form_q"
            navegador.findElement(By.id("sb_form_q")).click();

            // Digitar no campo que possui o id "sb_form_q" o texto "teste"
            navegador.findElement(By.id("sb_form_q")).sendKeys("teste de velocidade");

            // Clicar no botão "Pesquisar"
            ((ChromeDriver) navegador).findElementById("sb_form_go").click();

            //clicar no link que possui texto "www.minhaconexao.com.br"
            ((ChromeDriver) navegador).findElementByLinkText("www.minhaconexao.com.br")

;
        }catch (Exception e){
            e.printStackTrace();
            fail();
        }

        //fechar o navegador




}}