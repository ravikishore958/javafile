
import java.io.*;

public class filehandling {

	public static void main(String[] args)throws Exception {
		File f=new File("C:\\Users\\RAVI\\Desktop\\ran.txt");
		if(f.createNewFile()) {
			
			System.out.println("file sucsessfully created...!");

		}
		else {
			System.out.println("file already exists...!");
		}
	}


}
