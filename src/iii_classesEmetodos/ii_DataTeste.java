package iii_classesEmetodos;

public class ii_DataTeste {

	public static void main(String[] args) {
		
		ii_Data d1 = new ii_Data();
		d1.dia = 3;
		d1.mes = 9;
		d1.ano = 1987;
						
		var d2 = new ii_Data();
		d2.dia = 16;
		d2.mes = 1;
		d2.ano = 1981;
		
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
	}
}
