package aplicacao.seguro.pages;

import aplicacao.seguro.elementos.Elementos;
import aplicacao.seguro.metodos.Metodos;

public class DadosSegurado {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	public void preencherDadosSegurado(String name, String lastName, String dataNascimento,
			String address, String country, String cep, String cidade, String ocupacao, String website, String foto) {
		metodo.aguardarElemento(el.firstname);
		metodo.escrever(el.firstname, name);
		metodo.escrever(el.lastname, lastName);
		metodo.escrever(el.birthdate, dataNascimento);
		metodo.clicar(el.gendermale);
		metodo.escrever(el.address, address);
		metodo.escrever(el.country, country);
		metodo.escrever(el.zipcode, cep);
		metodo.escrever(el.city, cidade);
		metodo.escrever(el.occupation, ocupacao);
		metodo.clicar(el.hobbiesSpeeding);
		metodo.escrever(el.website, website);
		metodo.escrever(el.picture, foto);
		metodo.tirarPrint("target", "Segurado");
		metodo.clicar(el.btnNextInsurant);
		

	}

}
