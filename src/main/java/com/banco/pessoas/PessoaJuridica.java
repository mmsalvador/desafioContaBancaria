package com.banco.pessoas;

import lombok.Getter;

@Getter

public class PessoaJuridica extends Pessoa{

	private String cnpj;
	
	public PessoaJuridica(String nome, String endereco, String rg, String cnpj) {
		super(nome, endereco, rg);
		this.cnpj = cnpj;
	}
	
	/*
	public String getCnpj() {
		return cnpj;
	}*/
	
	@Override
	public String toString() {
		return super.toString() + "\nPessoaJurídica \nCNPJ: " + cnpj + "\n";
	}
	
}
