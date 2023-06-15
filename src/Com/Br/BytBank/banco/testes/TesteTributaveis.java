package Com.Br.BytBank.banco.testes;

import Com.Br.BytBank.banco.Arquivos.*;


public class TesteTributaveis {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(13256,456);
		cc.deposita(100);
		
		
		CalculadorIpostos  ci = new CalculadorIpostos();
		ci.registra(cc);
		System.out.println(ci.getValorimposto());
			
			
	}

}
