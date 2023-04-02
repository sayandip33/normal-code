package InnerClass;

interface B {
	public void test1();
	public void test2();
	public void test3();
}

public class Inner2 {
	public static void main(String[] args) {
		B b1 = new B() {
			public void test1() {
				System.out.println("Test 1");
			}
			public void test2() {
				System.out.println("Test 2");
			}
			public void test3() {
				System.out.println("Test 3");
			}
		};
		b1.test1();
		b1.test2();
		b1.test3();
	}
}
