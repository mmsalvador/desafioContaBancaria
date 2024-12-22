package com.banco.contas;

import com.banco.pessoas.Pessoa;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Pessoa titular) {
		super(titular);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(titular);
		System.out.println("=== Extrato Conta Poupança===");
		super.imprimirInfoConta();
		System.out.println("\n");
		
	}

	@Override
	public String toString() {
		return "ContaPoupanca" + super.toString();
	}

}
