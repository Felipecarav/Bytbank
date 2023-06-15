package Com.Br.BytBank.banco.Arquivos;

public class CalculadorIpostos {
	/*
	 * autor Felipe Carvalho
	 * 
	 * Calcula o imposto 
	 */
	
	/*
	 * 
	 */
	private double valorimposto;
	
	public void registra(Tributavel t) {
		double valor = t.getvalorIposto();
		this.valorimposto += valor;
		
	}
	
	public double getValorimposto() {
		return valorimposto;
	}
	

}
