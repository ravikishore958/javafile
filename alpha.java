
import java.util.Scanner;


public class alpha {
    
    public static void main(String[] args) {
        System.out.println("----------------------------STAR PATTERN----------------------------");
        a ref=new a();
        ref.alphaa();

        
    }
}
class a{

 void alphaa(){
int i, j, num;
Scanner sc=new Scanner (System.in);
System.out.println("enter your number =");
num=sc.nextInt();
for(i=1; i<=num; i++){
    for(j=1; j<=i; j++){
        System.out.print(j);
    }
    System.out.println();
}
    System.out.println("----------------------------END PATTERN----------------------------");

}
}