package Com.Br.BytBank.banco.Arquivos;

public class ContaCorrente  extends Conta implements Tributavel{

     public ContaCorrente(int agencia, int numero) {
    	 super(agencia, numero);
     }

  
     
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}


	@Override
	public double getvalorIposto() {
		
		return super.saldo * 0.01;
	}
	
	@Override
	public void saque(double valor) {
		double ValorASacar = valor + 0.2;
		super.saque(ValorASacar);
	}
	@Override
	public String toString() {
		return "Classe ContaCorrente " + super.toString() ;
	}

}
