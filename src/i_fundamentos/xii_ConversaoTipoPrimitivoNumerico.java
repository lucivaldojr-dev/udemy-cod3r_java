package i_fundamentos;

public class xii_ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; // implícita
		System.out.println(a);
		
		float b = (float) 1.1234567888888; // explicita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // explícita (CAST)
		System.out.println(d);
		
		double e = 1.8888888;
		int f = (int) e; // explícita (CAST)
		System.out.println(f);
	}

}
