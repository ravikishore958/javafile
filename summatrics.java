
import java.util.Scanner;

public class summatrics {
    public static void main(String[] args) {
       Scanner scan=new Scanner (System.in);
       int A[] []=new int[3] [3];
       int B[] []=new int[3][3];
       int C[][];
       int i,j,num;
       System.out.println("enter the first matrics=");
        num=scan.nextInt();
       for(i=0; i<num; i++){
            for(j=0;j<num; j++){
                A[i][j]=num;
            }
       } 
       System.out.println("enter the second matrics=");
        for(i=0; i<num; i++){
            for(j=0;j<num; j++){
                B[i][j]=num;
            }
             for(i=0; i<num; i++){
                 for(j=0;j<num; j++){
                    C[i][j]=A[i][j]+B[i][j];

                        }
                System.out.println(C[i][j]+"");

    }
}
}
}
