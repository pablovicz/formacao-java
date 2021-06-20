package br.com.pablovicz.loja.pedido.acao;

import br.com.pablovicz.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido{

	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando pedido no banco de dados.");
	}
}
