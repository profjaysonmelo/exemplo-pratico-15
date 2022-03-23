
public class ContaCorrente implements Tributo {

	private int numero;
	private double saldo;
	
	public ContaCorrente(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public double calcularTributo() {
		if (this.saldo > 0) {
			return this.saldo * 0.05;
		} else {
			return 0.0;
		}
	}
	
}
