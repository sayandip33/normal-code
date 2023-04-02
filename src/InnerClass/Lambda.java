package InnerClass;

interface C{
	public void test();
}

public class Lambda {
	public static void main(String[] args) {
		C c1 =() -> System.out.println(500);
		c1.test();
	}
}
