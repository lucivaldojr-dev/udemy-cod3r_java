package i_fundamentos;

import java.util.Scanner;

public class xxviii_Exercicio3 {

	public static void main(String[] args) {
		 // Crie um programa que leia o peso e a altura do usuário e imprima no console o IMC.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu peso:");
		double peso = scanner.nextDouble();
		
		System.out.println("Digite sua altura:");
		double altura = scanner.nextDouble();
		
		double imc = peso / ( altura * altura );
		
		System.out.print("Seu IMC é: " + imc);
		
		scanner.close();
	}
		
}
