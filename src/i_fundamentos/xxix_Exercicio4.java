package i_fundamentos;

import java.util.Scanner;

public class xxix_Exercicio4 {

	public static void main(String[] args) {
		// Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor qualquer: ");
		double valor = scanner.nextDouble();
		
		/** Existe tamb�m a seguinte possibilidade
		 * double quadrado = valor * valor;
		 * double cubo = valor * valor * valor;
		 */
		
		double quadrado = Math.pow(valor, 2);
		
		double cubo = Math.pow(valor, 3);
		
		System.out.print("O valor ao quadrado é: " + quadrado + "\n e o valor ao cubo é: " + cubo);
		
		scanner.close();
	}
}
