import java.io.IOException;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) throws IOException {

    		Scanner input = new Scanner(System.in);
    		int a, b, soma;
    		a = input.nextInt();
    		b = input.nextInt();
    		
    		soma = a + b;
    		
    		System.out.print("SOMA = " + soma);
    	}
    }