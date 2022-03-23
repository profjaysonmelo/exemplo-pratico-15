/*
 * Utilizando interface, implementar classes que representam um banco 
 * que precisa tributar (calcularTributo())
 * nas contas correntes e nos seguros de vida.
 */
public class Principal {

	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente(123, 500);
		System.out.println("Tributo: " + c1.calcularTributo());
		
		SeguroVida s1 = new SeguroVida("123-p", 15000);
		System.out.println("Tributo: " + s1.calcularTributo());
		
	}
}
