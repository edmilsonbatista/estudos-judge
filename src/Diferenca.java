import java.io.IOException;
import java.util.Scanner;

public class Diferenca {
	public static void main(String[] args) throws IOException {

    		Scanner input = new Scanner(System.in);	
    		int valor1 = input.nextInt();
    		int valor2 = input.nextInt();
    		int valor3 = input.nextInt();
    		int valor4 = input.nextInt();
    		
    		valor1 = valor1 * valor2 - valor3 * valor4; 
    		
    		System.out.print("DIFERENCA = " + (valor1) + "\n");
    		
	}
}