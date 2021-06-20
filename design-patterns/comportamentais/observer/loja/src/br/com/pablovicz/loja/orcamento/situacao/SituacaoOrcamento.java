package br.com.pablovicz.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.pablovicz.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {
	
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	public void aprovar(Orcamento orcamento) throws Exception {
		throw new Exception("O orcamento nao pode ser aprovado!");
	}
	
	public void reprovar(Orcamento orcamento) throws Exception {
		throw new Exception("O orcamento nao pode ser reprovado!");
	}
	
	public void finalizar(Orcamento orcamento) throws Exception {
		throw new Exception("O orcamento nao pode ser finalizado!");
	}

}
