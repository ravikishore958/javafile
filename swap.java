import java.util.Scanner;

public class swap {
    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
    public static final String RESET = "\033[0m";  // Text Reset
    public static final String GREEN = "\033[0;32m";   // GREEN
     static void swap1(){
          int a, b;
        Scanner as=new Scanner(System.in);
        System.out.println(RED_UNDERLINED+"enter a number22= "+RESET);
        a=as.nextInt();
        b=as.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
         System.out.printf(GREEN+"b=%2d\na=%2d\n", b, a);
    
    }
    
    public static void main(String[] args) {
        int a, b, temp=0; 
        Scanner as=new Scanner(System.in);
        System.out.println(RED_UNDERLINED+"enter a number= "+RESET);
        a=as.nextInt();
        b=as.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.printf( GREEN+"b=%2d a=%2d", b, a);
        System.out.println(RESET );
        swap1();
        
        
    }
   
    
}
