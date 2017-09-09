import java.io.IOException;
import java.rmi.dgc.DGC;
import java.text.DecimalFormat;
import java.util.*;

public class Salario {
	public static void main(String[] args) throws IOException {
			
		Locale.setDefault(Locale.US);    		
		Scanner ler = new Scanner(System.in);	
		DecimalFormat df = new DecimalFormat("0.00");
		int Cod = ler.nextInt();
		int Horas = ler.nextInt();
		double ValorH = ler.nextDouble();
		double Salario;
		
		Salario = Horas * ValorH;
		
		System.out.println("NUMBER = " + Cod);
		System.out.println("SALARY = U$ " + df.format(Salario));
}
}