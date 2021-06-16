package br.com.pablovicz.loja.desconto;

import java.math.BigDecimal;

import br.com.pablovicz.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoMaiorCincoItens extends Desconto{
	
	public DescontoParaOrcamentoMaiorCincoItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		if(orcamento.getQuantidadeItens() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		
		return proximo.calcular(orcamento);
	}
	
}
