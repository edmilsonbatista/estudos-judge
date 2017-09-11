import java.io.IOException;
import java.rmi.dgc.DGC;
import java.text.DecimalFormat;
import java.util.*;

public class SalariocomBonus {
	public static void main(String[] args) throws IOException {
			
		Locale.setDefault(Locale.US);    		
		Scanner ler = new Scanner(System.in);	
		DecimalFormat df = new DecimalFormat("0.00");
		
		String Nome = ler.next();
		double salario = ler.nextDouble();
		double vendas = ler.nextDouble();
		double total;
		
		total = salario + vendas * 0.15;
		
		System.out.println("TOTAL = R$ " + df.format(total));
		
}
}