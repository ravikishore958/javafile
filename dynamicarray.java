import java.util.Scanner;

public class dynamicarray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size;
        System.out.println("enter the size of array=");
        size=scan.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=scan.nextInt();
        }
        System.out.print("Printed array= ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
