package ii_estruturasDeControle;

import javax.swing.JOptionPane;

public class iii_IfElse {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog(
				"Infome um número: ");
		int numero = Integer.parseInt(valor);
		
		if (numero % 2 == 0) {
			System.out.println("Número par!");
		} else {
			System.out.println("Número ímpar!");
		}
		
	}
}
