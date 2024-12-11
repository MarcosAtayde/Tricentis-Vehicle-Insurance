package aplicacao.seguro.pages;

import aplicacao.seguro.elementos.Elementos;
import aplicacao.seguro.metodos.Metodos;

public class DadosProduto {
	
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	public void preencherDadosProduto(String dataInicio, String insuranceSum, String meritRating, String damageInsurance, String courtesyCar) {
		metodo.aguardarElemento(el.startDate);
		metodo.escrever(el.startDate, dataInicio);
		metodo.escrever(el.insuranceSum, insuranceSum);
		metodo.escrever(el.meritRating, meritRating);
		metodo.escrever(el.damageInsurance, damageInsurance);
		metodo.clicar(el.euroProtection);
		metodo.escrever(el.courtesyCar, courtesyCar);
		metodo.tirarPrint("target", "Produto");
		metodo.clicar(el.btnNextProductData);
		
		
		
	}
	
	

}
