import java.io.IOException;
import java.util.Scanner;

public class IdadeDias {
	public static void main(String[] args) throws IOException {
			
    		Scanner input = new Scanner(System.in);
    		int ano, meses, dias;
    		int d = input.nextInt();
    		
    		ano = d / 365;
    		meses = (d % 365) / 30;  
    		dias = (d % 365) % 30;
    		
    		System.out.println(ano+ " ano(s)" + "\n" + meses + " mes(es)" + "\n" + dias + " dia(s)");
	} 
}
