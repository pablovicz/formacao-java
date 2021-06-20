package br.com.pablovicz.loja.orcamento;

import java.math.BigDecimal;

import br.com.pablovicz.loja.orcamento.situacao.EmAnalise;
import br.com.pablovicz.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {

	private BigDecimal valor;
	private int quantidadeItens;
	private SituacaoOrcamento situacao;
	

	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
		this.situacao = new EmAnalise();
	}
	
	// sem DP - State
//	public void aplicarDescontroExtra() {
//		BigDecimal valorDoDescontoExtra = BigDecimal.ZERO;
//		if(situacao.equals("EM_ANALISE")) {
//			valorDoDescontoExtra = new BigDecimal("0.05");
//		} else if (situacao.equals("APROVADO")) {
//			valorDoDescontoExtra = new BigDecimal("0.02");
//		}
//		this.valor = this.valor.subtract(valorDoDescontoExtra);
//	}
	
	// com DP - State
	public void aplicarDescontroExtra() {
		BigDecimal valorDoDescontroExtra = this.situacao.calcularValorDescontoExtra(this);
		this.valor = this.valor.subtract(valorDoDescontroExtra);
	}
	
	public void aprovar() throws Exception {
		this.situacao.aprovar(this);
	}
	
	public void reprovar() throws Exception {
		this.situacao.reprovar(this);
	}
	
	public void finalizar() throws Exception {
		this.situacao.finalizar(this);
	}


	public BigDecimal getValor() {
		return valor;
	}


	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	
	
	public SituacaoOrcamento getSituacao() {
		return situacao;
	}
	
	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}
	
	
	
}
