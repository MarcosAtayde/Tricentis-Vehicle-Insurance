package aplicacao.seguro.pages;

import aplicacao.seguro.elementos.Elementos;
import aplicacao.seguro.metodos.Metodos;

public class EnviarCotacao {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	public void preencherdadosCotacao(String email, String phone, String userName, String password, String confirmPassword, String comments) {
		metodo.escrever(el.email, email);
		metodo.escrever(el.phone, phone);
		metodo.escrever(el.userName, userName);
		metodo.escrever(el.password, password);
		metodo.escrever(el.confirmPassword, confirmPassword);
		metodo.escrever(el.comments, comments);
		metodo.tirarPrint("target", "Cotacao");
		metodo.clicar(el.bntQuotesend);
		
		
		
	}

}

