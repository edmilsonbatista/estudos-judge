import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Media2 {
	public static void main(String[] args) throws IOException {
			
		Locale.setDefault(Locale.US);   
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		double nota1 = input.nextDouble();
		double nota2 = input.nextDouble();
		double nota3 = input.nextDouble();
		
		nota1 = (nota1*2+nota2*3+nota3*5)/10;    		 
		
		System.out.print("MEDIA = " + df.format(nota1) + "\n");
	}
}