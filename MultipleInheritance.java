package Problems;

interface A{
	void dis(); 
}

interface B{
	void dis();
}

class C implements A,B{

	@Override
	public void dis() {
		System.out.println("Hello");
		
	}
	
}

public class MultipleInheritance {
	
	
	
	public static void main(String[] args) {
		C c1= new C();
		c1.dis();
		
	}

}
