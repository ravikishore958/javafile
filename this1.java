
public class this1 {
	int a,c;
	this1(int a){
		this.a=a;
		this.c=20;
		
		
	}
	void show() {
		System.out.println(a);
		System.out.println(c);

	}

	public static void main(String[] args) {
		this1 ref=new this1(10);
		ref.show();
		
	}

}
