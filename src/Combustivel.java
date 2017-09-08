import java.io.IOException;
import java.rmi.registry.LocateRegistry;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Combustivel {
	public static void main(String[] args) throws IOException {
			
			Locale.setDefault(Locale.US);    		
			DecimalFormat df = new DecimalFormat("0.000");

    		Scanner input = new Scanner(System.in);
    		
    		double valor1 = input.nextDouble();
    		double valor2 = input.nextDouble();
    	    		   		
    		valor1 = valor1*valor2;
    		valor1 = valor1/12;
    		
    		System.out.print(df.format(valor1));		
	}
}