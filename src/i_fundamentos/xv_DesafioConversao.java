package i_fundamentos;

import java.util.Scanner;

public class xv_DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o primeiro salário: ");
		String valor1 = entrada.next().replace(",", ".");

		System.out.println("\nInforme seu segundo salário: ");
		String valor2 = entrada.next().replace(",", ".");
		
		System.out.println("\nInforme agora o terceiro salário: ");
		String valor3 = entrada.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.println("A média salarial fica em: " + media);
		
		entrada.close();
		
	}
}
