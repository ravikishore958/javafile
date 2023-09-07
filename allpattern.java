import java.util.Scanner;
public class allpattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i, j,n;
		int cn = 0; //current no.
		int count=0;
		System.out.println("enter the no.");
		n=scan.nextInt();
		for(i=1; i<=n; i++) {
			cn=i;
			count=0;
			
		
		for(j=1; j<=cn; j++) {
			if(cn%j==0) {
				
				count++;
			}
		}
		if(count==2) {
			System.out.println(cn);
			
		}
		
		
		
		}
		
		

	}

}
