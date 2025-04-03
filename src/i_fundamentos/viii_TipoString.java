package i_fundamentos;

public class viii_TipoString {

	public static void main(String[] args) {
		System.out.println("Olá Moçada".charAt(2));
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome ="Lucivaldo";
		var sobrenome = "Junior";
		var idade = 37;
		var salario = 12345.678;
		
		String frase = "Nome: " + nome + "\nSobrenome: " 
				+ sobrenome + "\nIdade: " + idade + 
				"\nSalário:  " + salario + "\n\n";
		System.out.println(frase);
		
		System.out.printf("O Senhor %s %s, tem %d anos de idade e ganha R$ %.2f.",
				nome, sobrenome, idade, salario);
	}
}
