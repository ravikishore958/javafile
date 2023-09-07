//						method overriding(run time )
//							polymorphisam



class te {
	void shape() {
		System.out.println("can't say that shape");
		
	}

}
class squar extends te{
	void shape1() {
		System.out.println("square shape");
	}	
}

class test{
	public static void main(String args[]) {
		squar r=new squar();
		r.shape();
	}
}
