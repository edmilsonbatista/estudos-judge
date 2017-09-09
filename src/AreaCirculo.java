import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

public class AreaCirculo {
	public static void main(String[] args) throws IOException {
			
		Locale.setDefault(Locale.US);    		
		Scanner ler = new Scanner(System.in);	
		DecimalFormat df = new DecimalFormat("0.0000");
		double area;
		double pi = 3.14159;
		double raio = ler.nextDouble();
		
		area = pi * raio * raio;
		
		System.out.println("A=" + df.format(area));
}
}