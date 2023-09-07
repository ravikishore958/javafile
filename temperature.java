import java.util.Scanner;
public class temperature {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double f;
		double c;
		System.out.println("enter the celsius= ");
		c=scan.nextDouble();
		f=(1.8*c)+32.0;
		System.out.println("fahrenheit= "+f);
	}

}
