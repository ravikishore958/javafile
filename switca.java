import java.util.Scanner;

public class switca{
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String RESET = "\033[0m";  // Text Reset


    public static void main(String[] args) {
      String username="";
      String pass="";
      int chance=1;
      String user1="ravi";
      String pass1="ravi12";
//      if(username=="ravi" && pass=="ravi123") {
//    	  System.out.println("you are sucsessfully login ");
//    	  
//      }
//      else {
//    	  System.out.println("wrong username and password");
//    	  System.out.println(RED_BOLD+"WASTED"+RESET);
//      }
//      
      for(int i=chance;chance<0; i++) {
    	  Scanner scan=new Scanner(System.in);
    	  System.out.println("enter your username=");
    	  username=scan.nextLine();
    	  System.out.println("enter your password=");
    	  
    	  pass=scan.nextLine();
    	  if(username==user1 && pass==pass1) {
        	  System.out.println("you are sucsessfully login ");
        	 
          }
    	  
          else {
        	  System.out.println("wrong username and password");
        	  System.out.println(RED_BOLD+"WASTED"+RESET);
          }
    	  
      }
      
    }
}
