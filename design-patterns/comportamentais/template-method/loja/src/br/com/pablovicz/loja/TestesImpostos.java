package br.com.pablovicz.loja;

import java.math.BigDecimal;

import br.com.pablovicz.loja.imposto.CalculadoraDeImpostos;
import br.com.pablovicz.loja.imposto.ICMS;
import br.com.pablovicz.loja.imposto.ISS;
import br.com.pablovicz.loja.imposto.TipoImposto;
import br.com.pablovicz.loja.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

		// sem strategy
		System.out.println("--- SEM STRATEGY ---");
		System.out.println("ISS: " + calculadora.calcular(orcamento, TipoImposto.ISS));
		System.out.println("ICMS: " + calculadora.calcular(orcamento, TipoImposto.ICMS));

		// Com Strategy
		System.out.println("--- COM STRATEGY ---");
		System.out.println("ISS: " + calculadora.calcularStrategy(orcamento, new ISS()));
		System.out.println("ICMS: " + calculadora.calcularStrategy(orcamento, new ICMS()));

	}

}
