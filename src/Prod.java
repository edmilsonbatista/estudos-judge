import java.io.IOException;
import java.util.Scanner;

public class Prod {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		int x, Y, prod;

		x = input.nextInt();
		Y = input.nextInt();

		prod = x * Y;
		System.out.println("PROD = " + prod);

    }
}