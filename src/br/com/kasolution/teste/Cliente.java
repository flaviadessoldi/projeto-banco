package br.com.kasolution.teste;

public class Cliente {
	
	private String nome;
	private double saldoCC;
	
	public Cliente(String nome, double saldoCC) {
		this.nome = nome;
		this.saldoCC = saldoCC;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldoCC() {
		return saldoCC;
	}
	
	public void setSaldoCC(double saldoCC) {
		this.saldoCC = saldoCC;
	}
}
