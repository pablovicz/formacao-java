package br.com.pablovicz.loja;

import java.math.BigDecimal;

import br.com.pablovicz.loja.imposto.CalculadoraDeImpostos;
import br.com.pablovicz.loja.imposto.ICMS;
import br.com.pablovicz.loja.imposto.ISS;
import br.com.pablovicz.loja.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

		System.out.println("--- COM STRATEGY ---");
		System.out.println("ISS: " + calculadora.calcular(orcamento, new ISS()));
		System.out.println("ICMS: " + calculadora.calcular(orcamento, new ICMS()));

	}

}
