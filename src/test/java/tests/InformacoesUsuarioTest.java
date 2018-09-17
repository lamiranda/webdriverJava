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
        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "c:\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        //Navegando para a página do Google!
        navegador.get("https://www.google.com.br");

        // Clicar no campo que possui o id "lst-ib"
       navegador.findElement(By.id("lst-ib")).click();

        // Digitar no campo que possui o id "lst-ib" o texto "teste"
        navegador.findElement(By.id("lst-ib")).sendKeys("teste de velocidade");

        // Clicar no botão "Pesquisa Google"
        ((ChromeDriver) navegador).findElementByXPath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1])").click();



        //fechar o navegador




}}