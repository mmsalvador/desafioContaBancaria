package com.banco.contas;

import com.banco.pessoas.Pessoa;

public class ContaCorrente extends Conta {

	public ContaCorrente(Pessoa titular) {
		super(titular);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(titular);
		System.out.println("=== Extrato Conta Corrente===");
		super.imprimirInfoConta();
		System.out.println("\n");
		
	}

	@Override
	public String toString() {
		return "ContaCorrente\n" + super.toString();
	}
	
	
}
