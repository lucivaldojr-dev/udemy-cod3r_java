package ii_estruturasDeControle;

import java.util.Scanner;

public class ix_DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Tu precisas dizer" 
					+ "\n as palavrinhas mágicas...");
			System.out.println("Queres sair? ");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("Sai da frente")); 
			
		System.out.println("Valeu!!");
		entrada.close();
	}
}
