package iii_classesEmetodos;

public class ii_Data {

	int dia;
	int mes;
	int ano;
	
	String obterDataFormatada () {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	void imprimirDataFormatada( ) {
		System.out.println(obterDataFormatada());
	}
}
