import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class CedulasMoedas {

	public static void main(String args[]) throws IOException {
		
		Locale.setDefault(Locale.US);    		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0");
		double n100=0, n50=0, n20=0, n10=0, n5=0, n2=0, n1=0;
		double valorm1, valorm2, m50=0, m25=0, m20=0, m10=0, m5=0, m1=0;
		
		valorm2 = input.nextDouble();
		
		valorm1 = valorm2*100;
		
		n100 = valorm2 / 100.0;
		valorm2 %= 100;	
		n50 = valorm2 / 50.0;
		valorm2 %= 50;
		n20 = valorm2 / 20.0;
		valorm2 %= 20;
		n10 = valorm2 / 10.0;
		valorm2 %= 10;
		n5 = valorm2 / 5.0;
		valorm2 %= 5;
		n2 = valorm2 / 2.0;
		valorm2 %= 2;
		n1 = valorm2 / 1.0;
		valorm2 %= 1;
		
		valorm1 = valorm1 % 100;
		m50 = valorm1 / 50;
		valorm1 %= 50;
		m25 = valorm1 / 25;
		valorm1 %= 25;
		m10 = valorm1 / 10;
		valorm1 %= 10;
		m5 = valorm1 / 5;
		valorm1 %= 5;
		m1 = valorm1;

		System.out.println("NOTAS:");
		System.out.println((int)n100 + " nota(s) de R$ 100.00");
		System.out.println((int)n50 + " nota(s) de R$ 50.00");
		System.out.println((int)n20 + " nota(s) de R$ 20.00");
		System.out.println((int)n10 + " nota(s) de R$ 10.00");
		System.out.println((int)n5 + " nota(s) de R$ 5.00");
		System.out.println((int)n2 + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println((int)n1 + " moeda(s) de R$ 1.00");
		System.out.println((int)m50 + " moeda(s) de R$ 0.50");
		System.out.println((int)m25 + " moeda(s) de R$ 0.25");
		System.out.println((int)m10 + " moeda(s) de R$ 0.10");
		System.out.println((int)m5 + " moeda(s) de R$ 0.5");
		System.out.println((int)m1 + " moeda(s) de R$ 0.01");
	}
}