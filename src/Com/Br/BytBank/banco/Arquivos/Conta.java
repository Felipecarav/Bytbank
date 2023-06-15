  package Com.Br.BytBank.banco.Arquivos;

public  abstract class Conta {
	
	/*
	 * Class conta é uma moldura de um conta no baytbank
	 */
	
	protected double saldo;
	private int agencia;
	private double numero;
	private Cliente titular;
	private static int total; 
	
	/*
	 * Construtor da classe
	 * 
	 * agencia: recebe um número que será a agencia da conta
	 * numero: recebe um número que sera o número da conta
	 */
	
	
	public Conta(int agencia, int numero) {	

        if(agencia < 1) {
            throw new IllegalArgumentException("Agencia inválida");
        }

        if(numero < 1) {
            throw new IllegalArgumentException("Numero da conta inválido");
        }

		this.agencia = agencia;
		this.numero = numero;
		Conta.total++;
	}
	
	/*
	 * Metodo abstrato que será editado em outras classe
	 * que estenderem da classe conta
	 */

	public abstract void deposita(double valor);
		
	
	 
	public void saque(double valor) {
		
			if(saldo<valor) {
				throw new SaldoInsufienteException("Saldo insufienete");
			}
			 this.saldo -= valor;
		
	}
	
	public  void transfere(double valor, Conta destino) throws SaldoInsufienteException {
		 saque(valor);
		destino.deposita(valor);
		
	}
	
    public double getSaldo() {
    	
	    return this.saldo;
    }
	
    public double getNumero() {
    	return this.numero;
    }
	
	public double getAgencia() {
		return this.agencia;
	}
	
	public Cliente getCliente() {
		return this.titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	
	
	public void setTitular(Cliente novoTitular) {
		this.titular = novoTitular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public String toString() {
		return "Numero: " + this.numero + " Agencia: " + this.agencia;
	}


}
