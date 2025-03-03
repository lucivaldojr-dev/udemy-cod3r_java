package i_fundamentos;

import java.util.Scanner;

public class xxvii_Exercicio2 {

	public static void main(String[] args) {
		
		// Crie um programa que leia e converta a temperatura em Fahrenheit para Celsius.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = scanner.nextDouble();
		
		double conversao = (fahrenheit - 32) / 1.8;
	
		System.out.print("Valor em Celsius: " + conversao);
		
		scanner.close();
	}
}
