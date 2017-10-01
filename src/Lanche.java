import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lanche {

	public static void main(String args[]) throws IOException {
		
		Scanner input = new	Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int codigo, quantidade;
		double preco = 0, total;
		
		System.out.println("Selecione qual lanche deseja\n" + " 1:Cachorro Quente\n 2:X-Salada\n 3:X-Bacon\n 4:Torrada Simples\n 5:Refrigerante\n");
		
		codigo = input.nextInt();
		quantidade = input.nextInt();
		
		
		if (codigo == 1){
			preco = 4.0;
		}
		else if (codigo == 2){
			preco = 4.5;
		}
		else if (codigo == 3){
			preco = 5.0;
		}
		else if (codigo == 4){
			preco = 2.0;
		}
		else{
			preco = 1.5;
		}
		
		total = quantidade * preco;
		
		System.out.println("Total: R$ " + df.format(total));
	}
}