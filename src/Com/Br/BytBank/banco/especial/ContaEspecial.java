package Com.Br.BytBank.banco.especial;

import Com.Br.BytBank.banco.Arquivos.Conta;

/*
 *
 */


public class ContaEspecial extends Conta {

	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposita(double valor) {
	     super.saldo += valor;

	}


}
