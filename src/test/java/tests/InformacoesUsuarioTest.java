package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InformacoesUsuarioTest {
    private WebDriver navegador;

    @Before
    public void setup(){
        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "c:\\Selenium\\Drivers\\chromedriver.exe");
        navegador = new ChromeDriver();

        //Navegando para a página do Bing
        navegador.get("https://www.bing.com/");
    }

    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario() {

        try {
            // Clicar no campo que possui o id "sb_form_q"
            navegador.findElement(By.id("sb_form_q")).click();

            // Digitar no campo que possui o id "sb_form_q" o texto "portugal"
            navegador.findElement(By.id("sb_form_q")).sendKeys("portugal");

            // Clicar no botão "Pesquisar"
            ((ChromeDriver) navegador).findElementByClassName("b_searchboxSubmit").submit();


            //clicar no link que possui texto "Notícias sobre Portugal"
            ((ChromeDriver) navegador).findElementByLinkText("Notícias sobre Portugal").click();


            //Clicar no texto "Fatos Principais"
            ((ChromeDriver) navegador).findElementByClassName("ntext").click();


            //Navegar para jornal do brasil
            navegador.get("http://www.jb.com.br/pais/2018/09/9871-lava-jato-esquema-de-propina-perdurou-por-tres-governos-no-parana.html");

            //acessar aba "país"
            navegador.get(("http://www.jb.com.br/pais"));

            //Clicar no campo de pesquisa
            WebElement element = ((ChromeDriver) navegador).findElementByXPath("//*[@id=\"q\"]");

            //Digitar no campo que possui o name "q"
            ((ChromeDriver) navegador).findElementByName("q").sendKeys("política");

            //Clicar em botão "buscar"
            ((ChromeDriver) navegador).findElementByCssSelector("#campo_busca > input[type=\"submit\"]:nth-child(2)").submit();

           //navegar para selenium easy
            navegador.get("http://www.seleniumeasy.com/test/");

            //clicar no botão "página inicial de demonstração"
            ((ChromeDriver) navegador).findElementByClassName("navbar-toggle").click();

            //Clicar no botão de "Começar a praticar"
            ((ChromeDriver) navegador).findElementById("btn_basic_example").click();

            //Clicar no botão "simples formulário de demontração"
            ((ChromeDriver) navegador).findElementByClassName("list-group-item").click();

            //Digitar o texto "Estou aprendendo a codificar scripts" com o botão de id "user-message"
            ((ChromeDriver) navegador).findElementById("user-message").sendKeys("Estou aprendendo a codificar scripts");

            //Clicar no botão "Mostrar mensagem"
            ((ChromeDriver) navegador). findElementByClassName("btn btn-default").click();


            //Fechar navegador
            navegador.quit();


        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }


        }

    }