import java.text.DecimalFormat;
import java.util.Scanner;

public class Cedulas {

	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int valor1, valor2, n100=0, n50=0, n20=0, n10=0, n5=0, n2=0, n1=0;
		
		valor1 = ler.nextInt();
		
		valor2 = valor1;
		
		n100 = valor1 / 100;
		valor1 %= 100;	
		n50 = valor1 / 50;
		valor1 %= 50;
		n20 = valor1 / 20;
		valor1 %= 20;
		n10 = valor1 / 10;
		valor1 %= 10;
		n5 = valor1 / 5;
		valor1 %= 5;
		n2 = valor1 / 2;
		valor1 %= 2;
		n1 = valor1 / 1;

		System.out.println(valor2);	
		System.out.println(n100 + " nota(s) de R$ 100,00");
		System.out.println(n50 + " nota(s) de R$ 50,00");
		System.out.println(n20 + " nota(s) de R$ 20,00");
		System.out.println(n10 + " nota(s) de R$ 10,00");
		System.out.println(n5 + " nota(s) de R$ 5,00");
		System.out.println(n2 + " nota(s) de R$ 2,00");
		System.out.println(n1 + " nota(s) de R$ 1,00");
	}
}