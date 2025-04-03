package ii_estruturasDeControle;

public class xiii_DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for (int i = 0; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		// Versão do desafio
		// Não pode usar o valor numérico pra controlar o laço!
		
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}
}
