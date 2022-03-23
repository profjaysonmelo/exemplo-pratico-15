
public class SeguroVida implements Tributo {

	private String identificadorApolice;
	private double valorApolice;
	
	public SeguroVida(String identificadorApolice, double valorApolice) {
		this.identificadorApolice = identificadorApolice;
		this.valorApolice = valorApolice;
	}
	
	public String getIdentificadorApolice() {
		return identificadorApolice;
	}
	public void setIdentificadorApolice(String identificadorApolice) {
		this.identificadorApolice = identificadorApolice;
	}
	public double getValorApolice() {
		return valorApolice;
	}
	public void setValorApolice(double valorApolice) {
		this.valorApolice = valorApolice;
	}

	@Override
	public double calcularTributo() {
		if (this.valorApolice > 0 && this.valorApolice <= 10000) {
			return this.valorApolice * 0.05;
		} else if (this.valorApolice > 10000 && this.valorApolice <= 50000) {
			return this.valorApolice * 0.10;
		} else {
			return this.valorApolice * 0.15;
		}
	}
	
}
