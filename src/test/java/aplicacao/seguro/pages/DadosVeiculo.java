package aplicacao.seguro.pages;

import aplicacao.seguro.elementos.Elementos;
import aplicacao.seguro.metodos.Metodos;

public class DadosVeiculo {
	
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	public void preencherDadosVeiculo(String marca, String performance, String ano, String bancos, String combustivel,
			String placa, String preco, String km) {
		metodo.escrever(el.make, marca);
		metodo.escrever(el.engine, performance);
		metodo.escrever(el.year, ano);
		metodo.escrever(el.seats, bancos);
		metodo.escrever(el.fuel, combustivel);
		metodo.escrever(el.plate, placa);
		metodo.escrever(el.price, preco);
		metodo.escrever(el.mileAge, km);
		metodo.clicar(el.btnNextVehicle);
		
		
		

	}

}
