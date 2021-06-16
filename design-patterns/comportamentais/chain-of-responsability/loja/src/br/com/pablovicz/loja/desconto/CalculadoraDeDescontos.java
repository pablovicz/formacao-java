package br.com.pablovicz.loja.desconto;

import java.math.BigDecimal;

import br.com.pablovicz.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {

		// SEM CHAIN OF RESPONSABILITY
//		if(orcamento.getQuantidadeItens() > 5) {
//			return orcamento.getValor().multiply(new BigDecimal("0.1"));
//		}
//		
//		if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
//			return orcamento.getValor().multiply(new BigDecimal("0.1"));
//		}
//		
//		return BigDecimal.ZERO;

		// COM CHAIN OF RESPONSABILITY
		Desconto desconto = new DescontoParaOrcamentoMaiorCincoItens(
								new DescontoParaOrcamentoValorMaiorQuinhentos(
								new SemDesconto()));

		return desconto.calcular(orcamento);
	}

}
