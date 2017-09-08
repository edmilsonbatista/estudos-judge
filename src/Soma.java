import java.io.IOException;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) throws IOException {

    		Scanner input = new Scanner(System.in);
    		int valor1 = input.nextInt();
    		int valor2 = input.nextInt();
    
    		valor1 = valor1 + valor2;
    		    		
    		System.out.println("X = " + valor1);
    	}
    }