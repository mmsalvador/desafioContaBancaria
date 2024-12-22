package com.banco.sistema;

import java.util.List;
import com.banco.contas.Conta;
import java.util.ArrayList;

import lombok.Getter;

@Getter
public class SistemaBanco {
	
	private String nome;
	private List<Conta> contas;
	
	public SistemaBanco (String nome) {
		this.nome = nome;
		System.out.printf("BEM VIM AO BANCO %s \n\n", nome.toUpperCase());
		this.contas = new ArrayList<Conta>();
		
	}
	
	public void adicionarConta (Conta novaconta) {
		contas.add(novaconta);
	}

	/*
	public String getNome() {
		return nome;
	}*/
	
	public void imprimirListaDeContas () {
		for (Conta conta : contas) {
				System.out.println(conta);
		}
	}
}
