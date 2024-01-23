public class Calculator {
	public static void main(String args[]) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		SimpleMath mark = new SimpleMath();
		System.out.println("PI =" + mark.PI);
		System.out.println("e =" + mark.e);
		System.out.println("a+b=" + mark.add(a, b));
		System.out.println("a-b=" + mark.subtract(a, b));
	}
}
