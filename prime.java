import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        int i;
        int num, count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number. ");
        num=sc.nextInt();
        for(i=1; i<=num; i++){
            if(num%i==0){

                count++;
            }
        }
        
        if(count==2){
            System.out.println("prime number= "+num);


        }
        else{
            System.out.println("prime not number= "+num);


        }
    }
    }
    

