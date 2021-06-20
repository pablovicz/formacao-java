package br.com.pablovicz.loja.imposto;

import java.math.BigDecimal;

import br.com.pablovicz.loja.orcamento.Orcamento;

public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);
}
