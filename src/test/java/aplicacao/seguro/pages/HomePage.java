package aplicacao.seguro.pages;

import aplicacao.seguro.elementos.Elementos;
import aplicacao.seguro.metodos.Metodos;

public class HomePage {
	
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	
	public void acessarFormulario() {
		metodo.clicar(el.automobile);
		
	}

}
