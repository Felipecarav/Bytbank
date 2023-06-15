package Com.Br.BytBank.banco.Arquivos;

public class ContaPoupanca  extends Conta{

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
		
	}

	public void saque(double valor) {
		 double ValorASacar = valor + 0.20;
		   super.saque(ValorASacar);
		 
	}   


  @Override
public String toString() {
	return "Classe ContaPoupanca " + super.toString();
}
	



	



	
}	
