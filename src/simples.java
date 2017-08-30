import java.io.IOException;
import java.util.Scanner;

public class simples {

//public class Main {
 
    public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		int num1, num2, x;

		num1 = input.nextInt();
		num2 = input.nextInt();
		
		x = num1 + num2;
		
		System.out.print("X = " + x);
	}
}
