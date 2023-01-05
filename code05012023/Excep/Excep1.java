package Excep;

public class Excep1 {
	static void test(int age) {
		try {
			if (age < 18) {
				throw new ArithmeticException("not valid");
			} else {
				System.out.println("ok");
			}

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		test(10);
		System.out.println("rest code");
	}
}
