import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

public class CalculoSimples {
	public static void main(String[] args) throws IOException {
			
		Locale.setDefault(Locale.US);    		
		Scanner ler = new Scanner(System.in);	
		DecimalFormat df = new DecimalFormat("0.00");
		int CODIGO1 = ler.nextInt();
		int VLPECA1 = ler.nextInt();
		double VALOR1 = ler.nextDouble();
		
		int CODIGO2 = ler.nextInt();
		int VLPECA2 = ler.nextInt();
		double VALOR2 = ler.nextDouble();
			
		VALOR1 = (VLPECA1 * VALOR1) + (VLPECA2 * VALOR2);

		System.out.println("VALOR A PAGAR: R$ " + df.format(VALOR1));
}
}