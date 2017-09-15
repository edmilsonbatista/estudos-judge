import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.abs;

public class Main {
	public static void main(String[] args) throws IOException {
			
    		Scanner input = new Scanner(System.in);
    		int horas, minutos, segundos;
    		int V = input.nextInt();
    		
    		horas = V / 3600;
    		minutos = (V % 3600) / 60;  
    		segundos = (V % 3600) % 60;
    		
    		System.out.println(horas+ ":" + minutos + ":" + segundos);
	}
}
