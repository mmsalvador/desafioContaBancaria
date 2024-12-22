package com.banco.contas;

import com.banco.pessoas.Pessoa;
public abstract class Conta implements InterConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1000;
	
	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	protected Pessoa titular;

	
	public Conta (Pessoa titular) {
		this.agencia = AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
		this.saldo = 0.0;
		this.titular = titular;
	}
	
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public void transferir(InterConta contaDestino, double valor) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}


	public void imprimirInfoConta() {
		System.out.printf("Agência: %d\n", this.agencia);
		System.out.printf("Número da Conta: %d\n", this.numeroConta);
		System.out.printf("Saldo: %.2f\n", this.saldo);
	}

	@Override
	public String toString() {
		return "\nNumero da Conta: " + numeroConta + "\n"
				+ titular.toString();
	}
		
	
}
