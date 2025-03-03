package i_fundamentos;

public class xix_DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = true;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		// Operador Unário
		boolean maisSaude = !comprouSorvete;
		
		System.out.println("Comprou uma TV de 50\"?: " + comprouTV50);
		System.out.println("Comprou uma TV de 32\"?: " + comprouTV32);
		System.out.println("Comprou um sorverte?: " + comprouSorvete);
		System.out.println("Mais saudável: " + maisSaude);
		
	}
}
