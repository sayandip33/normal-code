package InnerClass;

interface A {
	public void test();
}

public class Inner {
	public static void main(String[] args) {
		A a1 = new A() {
			public void test() {
				System.out.println("100000");
			}
		};
		a1.test();
	}
}
