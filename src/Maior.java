import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.Math.abs;

public class Maior {
	//public class Main {

	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int a;
		int b;
		int c;
		int MaiorAB;

		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		
		MaiorAB = (a + b + Math.abs(a - b)) / 2;
		MaiorAB = (MaiorAB + c + Math.abs(MaiorAB - c)) / 2;


		System.out.println(MaiorAB + " eh o maior");
	}
}