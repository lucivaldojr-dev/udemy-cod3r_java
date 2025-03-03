package i_fundamentos;

public class xviii_Logicos {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || !condicao2);
		System.out.println(condicao1 ^ !condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);
		
		System.out.println("\nTabela Verdade \"E\""); //  pra exibir algo entre aspas
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("\nTabela Verdade \"OU\""); //  pra exibir algo entre aspas
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela Verdade \"OU EXCLUSIVO (XOR)\""); //  pra exibir algo entre aspas
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTabela Verdade \"NOT\""); //  pra exibir algo entre aspas
		System.out.println(!true);
		System.out.println(!false);
		
	}
}
