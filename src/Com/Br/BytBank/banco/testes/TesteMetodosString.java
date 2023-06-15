package Com.Br.BytBank.banco.testes;

import Com.Br.BytBank.banco.Arquivos.ContaCorrente;
import Com.Br.BytBank.banco.Arquivos.ContaPoupanca;

public class TesteMetodosString {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(255,525);
		Object cp = new ContaPoupanca(542,454);
		System.out.println(cc);
		System.out.println(cp);
		

	}

}
