package i_fundamentos;

public class xxiii_OperadorTernario {

	public static void main(String[] args) {
		
		double media = 8.6;
		String resultadoFinal = media >= 7.0 ?
				"foi Aprovado." : "infelizmente ficou de recuperação";
		System.out.println("O aluno " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Infelizmente Não.";
		
		System.out.printf("tem desconto? %s:", resultado);
	}
}
