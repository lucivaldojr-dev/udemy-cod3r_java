package i_fundamentos;

import java.util.Scanner;

public class ix_Console {

	public static void main(String[] args) {
		
		System.out.println("Bom");
		System.out.println("dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("MegaSena:  %d %d %d %d %d %d %n",
				1, 2, 3, 4, 5 ,6);
		System.out.printf("Salário: %.1f%n", 2345.6789);
		System.out.printf("Nome: %s%n", "Luci");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
				
		System.out.println("Digite sua iddade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n", 
				nome, sobrenome, idade);
		
		entrada.close();
	}
}
