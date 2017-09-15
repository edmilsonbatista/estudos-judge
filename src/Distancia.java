import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.abs;

public class Main {
	public static void main(String[] args) throws IOException {
			
			Locale.setDefault(Locale.US);    		
			DecimalFormat df = new DecimalFormat("0.0000");

    		Scanner input = new Scanner(System.in);
    		
    		int distancia = input.nextInt();
    		double t;
 
    		t = abs(-distancia/(90 - 60.0)) * 60;
    		
    		
    		System.out.println((int) t + " minutos");
	}
}
