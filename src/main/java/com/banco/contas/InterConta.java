package com.banco.contas;

public interface InterConta {
	
	void sacar (double valor);
	
	void depositar (double valor);
	
	void transferir (InterConta contaDestino, double valor);
	
	void imprimirExtrato ();

}
