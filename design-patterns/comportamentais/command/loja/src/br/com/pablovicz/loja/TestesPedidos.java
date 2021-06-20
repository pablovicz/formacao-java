package br.com.pablovicz.loja;

import java.math.BigDecimal;

import br.com.pablovicz.loja.pedido.GeraPedido;
import br.com.pablovicz.loja.pedido.GeraPedidoHandler;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = args[0];
		BigDecimal valorOrcamento = new BigDecimal(args[1]);
		int quantidadeItens = Integer.parseInt(args[2]);
		
		
		// Design Pattern - Command
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(/*dependencias*/);
		
		handler.execute(gerador);
		
		
	}

}
