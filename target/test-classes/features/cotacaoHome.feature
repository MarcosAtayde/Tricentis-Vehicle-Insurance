Feature: Realizar cotacao de seguros
Como usuario do site
Quero realizar a cotacao
Para pbter os valores de seguro

@cotacaoSeguro
Scenario: Cotacao de seguros.
Given que eu acesse o site "https://sampleapp.tricentis.com/101/index.php"
When acesso automobile
And preencho os dados do veiculo
And preecho os dados do seguro
And preencho os dados do produto
And seleciono a opcao preco
Then valido a cotacao de seguro