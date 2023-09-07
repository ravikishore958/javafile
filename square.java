
import java.util.Scanner;
public class square {
    public static final String RESET = "\033[0m";  // Text Reset
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW


    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
            System.out.println("\u001b[31;1menter the number =");
            num=sc.nextInt();
        
        
        for(int i=5; i>=1; i--){ 
            for(int j=num; j>=i; j--){
                System.out.print(BLUE+j+">>> "+RESET);
               
            }
            System.out.println(" ");
        }

    }
    
}
