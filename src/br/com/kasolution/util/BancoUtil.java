package br.com.kasolution.util;

import br.com.kasolution.teste.Cliente;

public class BancoUtil {
	
	public static final double CORRECAO_MENSAL = 1.05;
	
	public static double investimentoMensal(double valor, int meses) {
		double valorFinal = valor;
		for (int i = 1; i <= meses; i++) {
			valorFinal *= CORRECAO_MENSAL;
		}//fim for
		return valorFinal;
		
	}//fim mensal
	
	
	public static int investimentoDesejado(double valorInicial, 
			double valorDesejado) {
		double valorFinal = valorInicial;
		int meses = 0;
		do {
			valorFinal *= CORRECAO_MENSAL;
			meses++;
		}while (valorFinal < valorDesejado);

		return meses;
	}//fim desejado
	
	
	public static int promocao(Cliente cliente,
			double valorPromocao) {
		int meses = 0;
		double valorFinal = cliente.getSaldoCC();
		while (valorFinal < valorPromocao) {
			valorFinal *= CORRECAO_MENSAL;
			meses++;
		}
		return meses;
	}//fim promocao

}//fim classe