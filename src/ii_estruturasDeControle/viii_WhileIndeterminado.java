package ii_estruturasDeControle;

import java.util.Scanner;

public class viii_WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while (!valor.equalsIgnoreCase("sair")) {
			System.out.println("Tu dizes");
			valor = entrada.nextLine();
		}
		entrada.close();
	}
}
