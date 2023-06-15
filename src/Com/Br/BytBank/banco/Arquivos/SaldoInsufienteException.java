package Com.Br.BytBank.banco.Arquivos;

public class SaldoInsufienteException extends RuntimeException {

	/*
	 * Exception herdada de runtime 
	 * 
	 */
	
	public SaldoInsufienteException(String msg) {
		super(msg);
	}
	
}
