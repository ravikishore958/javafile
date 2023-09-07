//					method overloading(compile time)
//						polymorphism 
public class poly {
	void add() {
		int a=10, b=20, c;
		c=a+b;
		System.out.println(c);
	}
	void add(int a, int b) {
		int  c;
		c=a+b;
		System.out.println(c);
	}
	void add(int a,  double b) {
		double c;
		c=a*b;
		System.out.println(c);
		
	}
	
	public static void main(String arg[]) {
		poly a=new poly();
		a.add();
		a.add(100,200);
		a.add(10, 23.3);
		
		
		
	}
	}
	


