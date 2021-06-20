package br.com.pablovicz.loja.desconto;

import java.math.BigDecimal;

import br.com.pablovicz.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoValorMaiorQuinhentos extends Desconto{
	
	public DescontoParaOrcamentoValorMaiorQuinhentos(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.5"));
	}

	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}
	
}
