
class bank {
int interest() {
	return 3;
}

}
class sbi extends bank{
	int interest() {
		super.interest();
		return 8;
	}
	
}
class axis extends bank{
	int interest() {
		return 6;
	}
}
class hdfc extends bank{
	int interest() {
		return 5;

		
		
	}

}
class banktest{
public static void main(String abc[]) {
	sbi s=new sbi();
	axis a=new axis();
	hdfc h=new hdfc();
	System.out.println("sbi interest rate is "+ s.interest());
	System.out.println("axis interest rate is "+ a.interest());
	System.out.println("hdfc interest rate is "+ h.interest());
}
}

