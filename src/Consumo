import java.io.IOException;
import java.rmi.registry.LocateRegistry;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Consumo {
	public static void main(String[] args) throws IOException {
			
			Locale.setDefault(Locale.US);    		
			DecimalFormat df = new DecimalFormat("0.000");

    		Scanner input = new Scanner(System.in);
    		
    		double distancia = input.nextDouble();
    		double litros = input.nextDouble();
    		double  media;
 
    		media = distancia/litros;
    		
    		System.out.println(df.format(media) + " km/l");
	}
}
