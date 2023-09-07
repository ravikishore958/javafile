import java.util.Scanner;

public class evenodd {
    public static void main(String even[]){
        Scanner a = new Scanner(System.in);
            System.out.println("Enter the number for even or odd ");
             int num=a.nextInt();
            if(num%2==0){
                System.out.println("even number "+ num);
            }
            else{
                System.out.println("odd number "+num);
            }
        
    }
    
}
