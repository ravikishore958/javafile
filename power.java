import java.util.Scanner;
public class power {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
	int n,power;
	int i=1;
	int sum=1;
	System.out.println("enter the value=");
	n=scan.nextInt();
	System.out.println("enter the power=");
	power=scan.nextInt();
	while(i<=power) {
		sum= sum*n;
		i++;
	}
	System.out.println(sum);
	

	}

}
