package i_fundamentos;

public class x_PrimitivoVsObjeto {

	public static void main(String[] args) {
		
		String s = new String("texto");
		s.toUpperCase();
		
		// Wrappers são a versão orientada a objetos dos tipos primitivos!
		int a = 123;
		System.out.println(a);
	}
}
