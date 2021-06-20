package br.com.pablovicz.loja.orcamento.situacao;

import br.com.pablovicz.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento{
	
	@Override
	public void finalizar(Orcamento orcamento) throws Exception {
		orcamento.setSituacao(new Finalizado());
	}

}
