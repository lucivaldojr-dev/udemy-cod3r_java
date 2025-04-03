package i_fundamentos;

public class v_TiposPrimitivos {

	public static void main(String[] args) {
		// Informações do Funcionário
		
		// Tipo numéricos interior
		byte anosDeEmpresa = 23;
		short numeroVoos = 540;
		int id = 67890;
		long pontosAcumulados = 3_134_845_223L;
		
		// Tipos numéricos reais
		float salario = 11_450_50F;
		double vendasAcumuladas = 2_990_798_105.01;
		
		// Tipos boolenao
		boolean statusFerias = false; // or true
				
		// Tipo caractere
		char status = 'A'  ; // ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Números de viagens
		System.out.println(numeroVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Está de férias? " + statusFerias);
		System.out.println("Status: " + status);
	}
}
