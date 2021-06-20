package br.com.pablovicz.loja.pedido.acao;

import br.com.pablovicz.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido{

	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando email com confirmação de pedido");
	}
}
