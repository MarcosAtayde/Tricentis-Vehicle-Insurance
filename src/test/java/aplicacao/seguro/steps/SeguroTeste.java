package aplicacao.seguro.steps;

import aplicacao.seguro.navegadores.Navegadores;
import aplicacao.seguro.pages.DadosProduto;
import aplicacao.seguro.pages.DadosSegurado;
import aplicacao.seguro.pages.DadosVeiculo;
import aplicacao.seguro.pages.EnviarCotacao;
import aplicacao.seguro.pages.HomePage;
import aplicacao.seguro.pages.OpcaoPreco;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SeguroTeste {

	HomePage home = new HomePage();
	DadosVeiculo dados = new DadosVeiculo();
	DadosSegurado segurado = new DadosSegurado();
	DadosProduto produto = new DadosProduto();
	OpcaoPreco preco = new OpcaoPreco();
	EnviarCotacao enviar = new EnviarCotacao();

	@Given("que eu acesse o site {string}")
	public void queEuAcesseOSite(String site) {
		Navegadores.iniciarTeste(site);

	}

	@When("acesso automobile")
	public void acessoAutomobile() {
		home.acessarFormulario();

	}

	@When("preencho os dados do veiculo")
	public void preenchoOsDadosDoVeiculo() {
		dados.preencherDadosVeiculo("Audi", "700", "01/01/2022", "4", "Gas", "AUDIRS6", "100000", "15000");

	}

	@When("preecho os dados do seguro")
	public void preechoOsDadosDoSeguro() {
		segurado.preencherDadosSegurado("Paulo", "Atayde", "12/10/1963", "Rua Oswaldo Bonanzini, 35", "Brazil",
				"09435240", "Ribeirão Pires", "Selfemployed", "ataydeconsultoria.com.br", "129189.j9g");

	}

	@When("preencho os dados do produto")
	public void preenchoOsDadosDoProduto() {
		produto.preencherDadosProduto("12/21/2024", "35.000.000,00", "Super Bonus", "Full Coverage", "Yes");

	}

	@When("seleciono a opcao preco")
	public void selecionoAOpcaoPreco() {
		preco.selecionarPreco();

	}

	@Then("valido a cotacao de seguro")
	public void validoACotacaoDeSeguro() {
		enviar.preencherdadosCotacao("marcosqa@gmail.com", "11988125884", "marcosatayde", "E2e@123", "E2e@123", "Eu vou ser um QA de sucesso, e vou atingir todos os meus objetivos!");

	}

}
