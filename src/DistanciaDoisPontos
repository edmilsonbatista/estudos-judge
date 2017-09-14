import java.io.IOException;
import java.rmi.registry.LocateRegistry;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class DistanciaDoisPontos {
	public static void main(String[] args) throws IOException {
			
			Locale.setDefault(Locale.US);    		
			DecimalFormat df = new DecimalFormat("0.0000");

    		Scanner input = new Scanner(System.in);
    		
    		double distancia1;
    		double distancia2;
    		double distancia;
    		double x1 = input.nextDouble();
    		double y1 = input.nextDouble();
    		double x2 = input.nextDouble();
    		double y2 = input.nextDouble();
    		 
    		distancia1 = x2 - x1; 
    		distancia2 = y2 - y1;
    		distancia = Math.pow(distancia1, 2) + Math.pow(distancia2, 2);
    		distancia = Math.sqrt(distancia);
    		
    		
    		
    		System.out.println(df.format(distancia));
	}
}
