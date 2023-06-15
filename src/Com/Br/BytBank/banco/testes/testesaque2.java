package Com.Br.BytBank.banco.testes;

import Com.Br.BytBank.banco.Arquivos.*;


public class testesaque2 {

	public static void main(String[] args) throws SaldoInsufienteException  {

		ContaCorrente conta = new ContaCorrente(123, 133);
		conta.deposita(500);
		System.out.println(conta.getSaldo());
		conta.saque(550);
		    System.out.println(conta.getSaldo());
	    
	    ContaPoupanca c2 = new ContaPoupanca(243, 5646);
	    c2.deposita(1000);
	    System.out.println(c2.getSaldo());
	    c2.transfere(950, conta);
	    System.out.println(c2.getSaldo());
	    System.out.println(conta.getSaldo());
	    
	    
	
	}

}
