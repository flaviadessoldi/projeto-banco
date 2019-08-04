package br.com.kasolution.teste;
import java.text.NumberFormat;

import br.com.kasolution.util.BancoUtil;

public class TesteBancoUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valorInvestimento = 10_000.00;
		int meses = 12;
		
		System.out.println("Simulação de investimento mensal: ");
		double valorFinal = BancoUtil.investimentoMensal
				(valorInvestimento, meses);
		String vMoeda = NumberFormat
				.getCurrencyInstance().format(valorFinal);
		//Number format para converter em moeda e retorna uma String
		System.out.println("Valor final: " + vMoeda);
		
		System.out.println("\nSimulação do valor desejado: ");
		double valorDesejado = 25_000.00;
		int mesesNecessarios = BancoUtil.investimentoDesejado
				(valorInvestimento, valorDesejado);
		System.out.println("Meses Necessários: " + mesesNecessarios);
		
		System.out.println("Simulação de promoção: ");
		Cliente [] clientes = BDCliente.getClientes();
		for(Cliente c : clientes) {
			int mesesInvestimento = BancoUtil.promocao(c, 30_000.00);
			if (mesesInvestimento > 0) {
				System.out.println("\nLigar para cliente: ");
				System.out.println(c.getNome());
				System.out.println("Meses Investimento: " + mesesInvestimento);
			}
		}
		
		
	}	

}
