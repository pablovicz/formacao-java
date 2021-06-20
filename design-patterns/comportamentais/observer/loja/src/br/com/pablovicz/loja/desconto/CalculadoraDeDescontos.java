package br.com.pablovicz.loja.desconto;

import java.math.BigDecimal;

import br.com.pablovicz.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {

		Desconto cadeiaDeDescontos= new DescontoParaOrcamentoMaiorCincoItens(
								new DescontoParaOrcamentoValorMaiorQuinhentos(
								new SemDesconto()));

		return cadeiaDeDescontos.efetuarCalculo(orcamento);
	}

}
