package com.banco.pessoas;

import lombok.*;

@Getter

public class PessoaFisica extends Pessoa {
	private String cpf;
	

	public PessoaFisica(String nome, String endereco, String rg, String cpf) {
		super(nome, endereco, rg);
		this.cpf = cpf;
	}
	
	/*
	public String getCpf() {
		return cpf;
	}*/


	@Override
	public String toString() {
		return super.toString() + "\nPessoaFisica \nCPF: " + cpf + "\n";
	}
	
}
