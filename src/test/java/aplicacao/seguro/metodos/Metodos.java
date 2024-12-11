package aplicacao.seguro.metodos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import aplicacao.seguro.drivers.Drivers;

public class Metodos extends Drivers {

	/**
	 * Clicar em um elemento passando o By
	 * 
	 * @param elemento
	 */
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	/**
	 * Escrever em um elemento
	 * 
	 * @param elemento
	 * @param texto
	 */
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	/**
	 * Informar a url que deseja validar
	 * 
	 * @param urlEsperada
	 */
	public void validarUrl(String urlEsperada) {
		assertEquals(urlEsperada, driver.getCurrentUrl());
	}

	/**
	 * Informar o texto esperado para ser validado com o texto capturado
	 * 
	 * @param elemento
	 * @param textoEsperado
	 */
	public void validarTexto(By elemento, String textoEsperado) {
		assertEquals(textoEsperado, driver.findElement(elemento).getText());
	}

	/**
	 * informar o elemento que será aguardado até segundos, dado que exceda o tempo,
	 * irá ocorrer time out.
	 * 
	 * @param elemento
	 */
	public void aguardarElemento(By elemento) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elemento));
	}

	public void tirarPrint(String nomeDaPastaDoTeste, String nomeDoTeste) {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("./evidencias/" + nomeDaPastaDoTeste + "/" + nomeDoTeste + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void trocarDeAba() {
		String abaPrincipal = driver.getWindowHandle();

		Set<String> todasAbas = driver.getWindowHandles();

		for (String ultimaAbaAberta : todasAbas) {

			if (!ultimaAbaAberta.equals(abaPrincipal)) {

				driver.switchTo().window(ultimaAbaAberta);

			}

		}

	}

	public void validarAlert(String textoEsperado) {
		Alert alert = driver.switchTo().alert();
		assertEquals(alert.getText(), textoEsperado);
	}

	public void scrooll(String pixel) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + pixel + ")");

	}

	public void zoom(String zoom) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='5" + zoom + "%'");

	}

	public void moverEClicar(By elemento) {
		WebElement el = driver.findElement(elemento);
		Actions actions = new Actions(driver);
		actions.moveToElement(el).click().perform();

	}

	public void duploClique(By elemento) {
		WebElement el = driver.findElement(elemento);
		Actions actions = new Actions(driver);
		actions.doubleClick(el).perform();
		;

	}

	public void mouseOver(By elemento) {
		WebElement el = driver.findElement(elemento);
		Actions actions = new Actions(driver);
		actions.moveToElement(el).perform();

	}

	public void tab() {
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB).perform();

	}

	public void enter() {
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();

	}

	public void enter(By elemento) {
		driver.findElement(elemento).sendKeys(Keys.ENTER);

	}

	public void limparCampo(By elemento) {
		driver.findElement(elemento).clear();

	}

	public void digitarPausadamente(By elemento, String texto) {
		for (char c : texto.toCharArray()) {
			driver.findElement(elemento).sendKeys(String.valueOf(c));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				// posso usar o metodo pausa para substituir as linhas acima
			}

		}

	}

	public void clicaESergura(By elemento) {
		WebElement el = driver.findElement(elemento);
		Actions actions = new Actions(driver);
		actions.clickAndHold(el).perform();

	}

	public void submite(By elemento) {
		driver.findElement(elemento).submit();

	}

	public void validarTitle(String titleEsperado) {
		assertEquals(titleEsperado, driver.getTitle());

	}

	public void voltarPagina() {
		driver.navigate().back();

	}

	public void avancarPagina() {
		driver.navigate().forward();

	}

	public void refresh() {
		driver.navigate().refresh();

	}

	public void uploadDeArquivos(By elemento, String path) {
		driver.findElement(elemento).sendKeys(path);

	}

	public void fecharPopUp(By elemento) {
		int contador = 3;
		WebElement element = driver.findElement(elemento);
		do {
			clicar(elemento);
			contador--;
		} while (element.isDisplayed() && contador > 0);

	}

	public void verificarTextoPresente() {

	}

	public void verificarCheckBoxSelecionado() {

	}

	public void pausa(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
		}
	}

	public void validarLivrodeOfertas(List<String[]> ofertasEsperadas) {

		// Pegar todas as linhas da tabela

		List<WebElement> linhas = driver.findElements(By.xpath("//*[@id='order-book']//tbody//tr"));

		// Percorrer todas as linhas da tabela

		for (int i = 0; i < linhas.size(); i++) {

			WebElement linha = linhas.get(i);

			// Para cada linha, capturar as colunas <td>

			List<WebElement> colunas = linha.findElements(By.tagName("td"));

			// Verificar se existem 3 colunas
			// vem do selenium

			if (colunas.size() == 3) {
				String ativo = colunas.get(0).getText();
				String preco = colunas.get(1).getText();
				String quantidade = colunas.get(2).getText();

				// Vem da Massa de dados

				String[] ofertaEsperada = ofertasEsperadas.get(i);
				String ativoEsperado = ofertaEsperada[0];
				String precoEsperado = ofertaEsperada[1];
				String quantidadeEsperado = ofertaEsperada[2];

				// Validar todos os valores

				if (ativo.equals(ativoEsperado) && preco.equals(precoEsperado)
						&& quantidade.equals(quantidadeEsperado)) {

					System.out
							.println("Oferta válida: " + ativo + " | Preço: " + preco + " | Quantidade: " + quantidade);

				} else {

					System.out.println(
							"Oferta inválida: " + ativo + " | Preço: " + preco + " | Quantidade: " + quantidade);

				}

			} else {
				System.out.println("A Linha está com formato inválido");
			}

		}

	}

}
