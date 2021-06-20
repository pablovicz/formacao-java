package br.com.pablovicz.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.pablovicz.loja.pedido.GeraPedido;
import br.com.pablovicz.loja.pedido.GeraPedidoHandler;
import br.com.pablovicz.loja.pedido.acao.EnviarEmailPedido;
import br.com.pablovicz.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestesPedidos {

	public static void main(String[] args) {
//		String cliente = args[0];
//		BigDecimal valorOrcamento = new BigDecimal(args[1]);
//		int quantidadeItens = Integer.parseInt(args[2]);
		
		String cliente = "Ana da Silva";
		BigDecimal valorOrcamento = new BigDecimal("600");
		int quantidadeItens = 6;
		
		
		// Design Pattern - Observer -> Acao
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido())
				);
		
		handler.execute(gerador);
	}

}
