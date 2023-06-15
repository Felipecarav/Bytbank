package Com.Br.BytBank.banco.testes;

import Com.Br.BytBank.banco.Arquivos.ContaCorrente;

public class TestaConta {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(112,232);
		cc.deposita(1500);
	}
	

}
