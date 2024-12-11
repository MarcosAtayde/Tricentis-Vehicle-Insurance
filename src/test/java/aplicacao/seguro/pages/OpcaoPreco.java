package aplicacao.seguro.pages;

import aplicacao.seguro.elementos.Elementos;
import aplicacao.seguro.metodos.Metodos;

public class OpcaoPreco {
	
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	
	public void selecionarPreco() {
		metodo.clicar(el.ultimate);
		metodo.aguardarElemento(el.btnNextPrice);
		metodo.tirarPrint("target", "Preco");
		metodo.clicar(el.btnNextPrice);
		
	}

}
