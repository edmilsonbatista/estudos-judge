import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

    		Scanner input = new Scanner(System.in);	
    		DecimalFormat df = new DecimalFormat("0.000");
    		int tempo, velocidade, distancia;
    		double litros;
    		
    		tempo = input.nextInt();
    		velocidade = input.nextInt();
    		
    		distancia = tempo*velocidade;
    		litros = distancia/12.0;
    		
    		System.out.print(df.format(litros));		
	}
}