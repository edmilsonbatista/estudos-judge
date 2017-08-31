	import java.io.IOException;
	import java.util.Scanner;
	
	public class simples {
	
	//public class Main {
	 
	    public static void main(String[] args) throws IOException {
			
			Scanner input = new Scanner(System.in);
			int A, B, X;
	
			A = input.nextInt();
			B = input.nextInt();
			
			X = A + B;
			
			System.out.print("X = " + X);
		}
	}
