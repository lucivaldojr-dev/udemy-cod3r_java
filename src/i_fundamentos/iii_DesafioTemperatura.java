package i_fundamentos;

public class iii_DesafioTemperatura {
	
	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		final double Fator = 5.0 / 9.0;
		final double Ajuste = 32;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - Ajuste) * Fator;
		System.out.println("O resultado seria esse: " + celsius + "°C.");
		
		fahrenheit = 0;
		celsius = (fahrenheit - Ajuste) * Fator;
		System.out.println("O resultado agora fica assim: " + celsius + "°C.");
	}
}
