package br.com.kasolution.teste;

public class BDCliente {

	public static Cliente [] getClientes() {
		Cliente [] clientes = {
				new Cliente ("Marcelo", 15_000.00),
				new Cliente ("Carla", 5_000.00),
				new Cliente ("Pablo", 45_000.00),
				new Cliente ("Mosquito", 9_000.00),
				new Cliente ("Sylvia", 3_000.00),
				new Cliente ("Diego", 60_000.00),
		};
		
		return clientes;
	}
}
