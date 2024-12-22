package com.banco.main;

import com.banco.sistema.SistemaBanco;
import com.banco.pessoas.*;
import com.banco.contas.*;

public class Main {

	public static void main(String[] args) {
		SistemaBanco novobanco = new SistemaBanco("universal");
		
		Pessoa titular1 = new PessoaJuridica("Jose Silva","Rua 1 - Cohab 1", "33.984.323-3", "23.167.098/0001-23");
		Pessoa titular2 = new PessoaFisica("Maria Gadu","Rua Holanda - Bairro 2", "29.233.788-5", "378.329.178-22");
		
		Conta conta1 = new ContaCorrente (titular1);
		Conta conta2 = new ContaPoupanca (titular2);
		
		novobanco.adicionarConta(conta1);
		novobanco.adicionarConta(conta2);
		
		conta1.imprimirExtrato();
		conta2.imprimirExtrato();
		
		conta1.depositar(1500);
		conta2.depositar(100);
		conta1.transferir(conta2, 500);
		
		conta1.imprimirExtrato();
		conta2.imprimirExtrato();

		novobanco.imprimirListaDeContas();
	}

}
