package tests;

import static org.junit.Assert.*;

import org.junit.After;
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
            System.setProperty("webdriver.chrome.driver", "c:\\Selenium\\Drivers\\chromedriver.exe");
            WebDriver navegador = new ChromeDriver();

            //Navegando para a página do Bing
            navegador.get("https://www.bing.com/");

            // Clicar no campo que possui o id "sb_form_q"
            navegador.findElement(By.id("sb_form_q")).click();

            // Digitar no campo que possui o id "sb_form_q" o texto "teste de velocidade"
            navegador.findElement(By.id("sb_form_q")).sendKeys("teste de velocidade");

            // Clicar no botão "Pesquisar"
            ((ChromeDriver) navegador).findElementById("sb_form_go").click();

            //clicar no link que possui texto "Teste de Velocidade - TecMundo"
            ((ChromeDriver) navegador).findElementByLinkText("Teste de Velocidade - TecMundo").click();

            //Clicar no texto "Iniciar o teste"
            ((ChromeDriver) navegador).findElementByLinkText("Iniciar o teste").click();

            //Fechar navegador
            navegador.quit();




        }catch (Exception e){
            e.printStackTrace();
            fail();
        }







}}