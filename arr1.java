
public class arr1 {

	public static void main(String[] args) {
		int arr[]= {1, 2, 3,6,7};
		
		int i, sum=0;
		
		for(i=0; i<arr.length; i++) {
			sum+=arr[i];
			
		}
		System.out.println("sum of number by using array="+sum);

				System.out.println("sum of number by using array="+arr[3]);


		 enhanced ref=new enhanced();
		 ref.display();
}
}  
//   					program 2
//   					array using enhanced for loop

class enhanced{
	String []arr= {"Ravi", "munish","kala", "rohit", "Sahil"};
	
	void display() {
		int length=arr.length;
		System.out.println("data found: "+length);
		for(String x:arr) {
			System.out.println(" ------"+x);
			
		}
		
	}
	
	
}

















