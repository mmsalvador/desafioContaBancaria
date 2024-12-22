package com.banco.pessoas;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public abstract class Pessoa {

	protected String nome;
	protected String endereco;
	protected String rg;

	/*
	public Pessoa (String nome, String endereco, String rg) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.rg = rg;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getRg() {
		return rg;
	}*/

	@Override
	public String toString() {
		return "Titular: " + nome + 
				"\nEndereco: " + endereco + "\n"
				+ "RG (Titular): " + rg + "\n";
		
	}
	
	
	
}
