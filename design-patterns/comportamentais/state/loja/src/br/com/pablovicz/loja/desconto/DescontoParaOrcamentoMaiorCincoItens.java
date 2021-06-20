package br.com.pablovicz.loja.desconto;

import java.math.BigDecimal;

import br.com.pablovicz.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoMaiorCincoItens extends Desconto{
	
	public DescontoParaOrcamentoMaiorCincoItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}
	
}
