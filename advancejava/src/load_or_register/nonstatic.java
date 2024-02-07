package load_or_register;

public class nonstatic {

	int i=m1();
	nonstatic(){
		//li
		System.out.println("Constructor");
	}
	int m1() {
		System.out.println("m1-method");
		return 20;
	}
	{
		System.out.println("insgtgan");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nonstatic obj=new nonstatic();
	}

}
