import java.util.Scanner;

public class forloop {
    public static void main(String loop[]){
        int num, i;
        Scanner no = new Scanner(System.in);
            System.out.println("enter the any no.");
             num=no.nextInt();
        
        for(i=0; i<=num; i++ ){
         System.out.println(i);
         }
    }
}
