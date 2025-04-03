package ii_estruturasDeControle;

import java.util.Scanner;

public class i_If {

	public static void main(String[] args) {
		
Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe uma média: ");
		double media = entrada.nextDouble();
		
		if (media <= 10 && media >= 7.0) {
			System.out.println("Aprovado!!!");
			System.out.println("Meus Parabéns!!!");
		}
		
		if (media < 7 && media >= 4.5)
			System.out.println("Ficastes em \"Recuperação\"");
		
		boolean criterioReprovar = 
				media < 4.5 && media >= 0;
				
		if ( criterioReprovar) {
			System.out.println("Infelizmente fostes \"Reprovado\".");
		}
		
		entrada.close();
		

	}
}
