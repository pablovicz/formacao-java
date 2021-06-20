package br.com.pablovicz.loja.imposto;

import java.math.BigDecimal;

import br.com.pablovicz.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	
	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}

}
