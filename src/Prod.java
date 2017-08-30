import java.io.IOException;
import java.util.Scanner;

public class Prod {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		int x, y, prod;

		x = input.nextInt();
		y = input.nextInt();

		prod = x * y;
		System.out.println("PROD = " + prod);

    }
}