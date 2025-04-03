package i_fundamentos;

public class vi_NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("! ! !");
		
		System.out.println(s);
		
		String x = "Lucivaldo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Arwen")
				.toUpperCase()
				.concat("! ! ! ");
		System.out.println(y);
		
		// Tipos primitivos não tem operador "."
		int a = 3;
		System.out.println(a);
	}
}
