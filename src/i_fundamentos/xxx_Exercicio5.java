package i_fundamentos;

import java.util.Scanner;

public class xxx_Exercicio5 {

	public static void main(String[] args) {
		// Crieum programa que leia o valor da base e da altura de um triângulo e calcule a área corretamente.
		
		Scanner scanner = new Scanner(System.in);
	    
		System.out.println("Digite a Base:");
		double base = scanner.nextDouble();
		
		System.out.println("Digite a Altura:");
		double altura = scanner.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.print("A Área do Triângulo é: " + area);
		
		scanner.close();
		
	}
}
