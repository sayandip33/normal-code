package InnerClass;

class AA{
	public void test() {
		System.out.println("Class AA");
	}
}
class BB extends AA{
	public void test() {
		System.out.println("Class BB");
	}
}

public class UpDownCasting {
	public static void main(String[] args) {
		AA a=new AA();
		a.test(); // Class AA
		
		AA a1=new BB();  // Upcasting 
		a1.test(); // Class BB
		
		BB b1= (BB)a1; // DownCasting 
		b1.test(); // Class BB
		
		
	}
}
