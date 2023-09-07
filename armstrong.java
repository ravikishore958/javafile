import java.util.*;
public class armstrong {
 public static void main(String[] args) {
//	input 153--->(1*1*1 + 5*5*5 + 3*3*3)=153
	 int num,rem,arm=0,c;
	 Scanner scan=new Scanner(System.in);
	 System.out.println("enter any number=");
	 num=scan.nextInt();
	 c=num;
	 while(num>0) {
		 rem=num%10;
		 arm=(rem*rem*rem)+arm;
		 num=num/10;
	 }
	 if(c==arm) {
		 System.out.println("ARMSTRONG ");
	 }
	 else
		 System.out.println(" NOT ARMSTRONG ");
}
}
