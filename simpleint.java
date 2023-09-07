import java.util.Scanner;
public class simpleint {

	public static void main(String[] args) {
			double p, r, t, si,p1,r2,t2;
			Scanner scan=new Scanner (System.in);
			System.out.println("PRINCIPLE amount enter: ");
			p=scan.nextDouble();
			System.out.println("RATE in percentage enter: ");
			r=scan.nextDouble();
			System.out.println("TIME in Months enter: ");
			t=scan.nextDouble();
//			
			si=(p*r*t)/100;
			System.out.println("SIMPLE INTREST= "+si);
			System.out.println("----------------------------------------");
			System.out.println("DETAILS->>"+"Total amt="+(si+p));
			System.out.println("----------------------------------------");

			p1=(100*si)/(r*t);
			System.out.println("principle: "+p1);
			r2=(100*si)/(p*t);
			System.out.println("rate: "+r2);
			t2=(100*si)/(p*r);
			System.out.println("time: "+t2);


	}

}
