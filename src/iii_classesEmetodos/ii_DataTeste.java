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
		
		System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
		System.out.printf("%d/%d/%d", d2.dia, d2.mes, d2.ano);
	}
}
