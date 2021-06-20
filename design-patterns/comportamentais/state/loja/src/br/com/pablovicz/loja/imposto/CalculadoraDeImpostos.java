package br.com.pablovicz.loja.imposto;

import java.math.BigDecimal;

import br.com.pablovicz.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	
	// sem usar strategy
	public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {
		
		switch (tipoImposto) {
		case ICMS:
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		case ISS:
			return orcamento.getValor().multiply(new BigDecimal("0.06"));
		default:
			return BigDecimal.ZERO;
		}
	}
	
	// usando o DesingPattern STRATEGY
	public BigDecimal calcularStrategy(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}

}
