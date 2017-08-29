import java.util.Scanner;
//Edmilson Batista
public class Soma {
	//public class Main {

	public static void main(String args[]) {

		Scanner ler = new Scanner(System.in);
		int a;
		int b;
		int soma;

		a = ler.nextInt();
		b = ler.nextInt();
		
		soma = a + b;
		
		System.out.print("SOMA = " + soma);
	}
}