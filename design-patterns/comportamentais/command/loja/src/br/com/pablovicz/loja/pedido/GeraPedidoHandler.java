package br.com.pablovicz.loja.pedido;

import java.time.LocalDateTime;

import br.com.pablovicz.loja.orcamento.Orcamento;

public class GeraPedidoHandler {

	// constructor com injecao de dependencias: repository, service, etc

	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
	}

}
