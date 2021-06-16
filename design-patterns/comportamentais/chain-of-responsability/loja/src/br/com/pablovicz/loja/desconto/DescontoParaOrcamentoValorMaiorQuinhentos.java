package br.com.pablovicz.loja.desconto;

import java.math.BigDecimal;

import br.com.pablovicz.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoValorMaiorQuinhentos extends Desconto{
	
	public DescontoParaOrcamentoValorMaiorQuinhentos(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
			return orcamento.getValor().multiply(new BigDecimal("0.5"));
		}
		
		return proximo.calcular(orcamento);
	}
	
}
