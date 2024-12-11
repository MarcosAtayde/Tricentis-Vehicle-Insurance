package aplicacao.seguro.navegadores;

import org.openqa.selenium.chrome.ChromeDriver;

import aplicacao.seguro.drivers.Drivers;

public class Navegadores extends Drivers{
	
	public static void iniciarTeste(String site) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(site);
		
	}

}
