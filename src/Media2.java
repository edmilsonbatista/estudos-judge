import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Media2 {

	public static void main(String[] args) throws IOException {

    		Scanner input = new Scanner(System.in);
    		DecimalFormat df = new DecimalFormat("0,0");
    		
    		double A, B, C, MEDIA;
    		A = input.nextDouble();
    		B = input.nextDouble();
    		C = input.nextDouble();
    		
    		MEDIA = (A*2 + B*3 + C*5)/10;
    		
    		System.out.print("MEDIA = " + df.format(MEDIA));
    	}
    }