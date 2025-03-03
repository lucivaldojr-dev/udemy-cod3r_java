package i_fundamentos;

public class xxii_OperadoresUnarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1
		a--; // a = a - 1
		
		++a; // a = a + 1
		--a; // a = a - 1
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--);;
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}
