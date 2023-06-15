package Com.Br.BytBank.banco.testes;

import Com.Br.BytBank.banco.Arquivos.ContaCorrente;
import Com.Br.BytBank.banco.Arquivos.ContaPoupanca;

public class TesteConta {

	public static void main(String[] args) {

			ContaCorrente cc = new ContaCorrente(1094, 347);
			ContaPoupanca cp = new ContaPoupanca(132, 592);
			
			cc.deposita(500);
			cp.deposita(1400);			
			cc.saque(497);
			cp.getSaldo();
			cc.getSaldo();
			System.out.println(cc.getSaldo());
			System.out.println(cp.getSaldo());

		
				

		}

	}


